package com.github.lisdocument.neo4jclient.web;

import com.github.lisdocument.neo4jclient.bean.*;
import com.github.lisdocument.neo4jclient.dao.*;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * <br>-lastModify:2019/7/11 20:02
 *
 * @author Lixiaoban
 * @version 1.0
 */
@RestController
@Api(tags = "人员基本信息")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DirectedRepository directedRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ActedInRepository actedInRepository;

    @Autowired
    private WatchedRepository watchedRepository;

    @Autowired
    private WatcherRepository watcherRepository;

    @ApiOperation("添加人员")
    @PostMapping("addPerson")
    public Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @ApiOperation("查询人员")
    @GetMapping("/findOnePerson/{id}")
    public Person findOnePerson(@PathVariable("id")String id){
        return personRepository.findById(id).orElseGet(Person::new);
    }

    @ApiOperation("删除人员")
    @GetMapping("/deleteOnePerson/{id}")
    public String deleteOnePerson(@PathVariable("id")String id){
        personRepository.deleteById(id);
        return "success";
    }

    @ApiOperation("添加电影")
    @PostMapping("addMovie")
    public Movie addMobie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @ApiOperation("查询电影")
    @GetMapping("/findOneMovie/{id}")
    public Movie findOneMovie(@PathVariable("id")String id){
        return movieRepository.findById(id).orElseGet(Movie::new);
    }

    @ApiOperation("添加观影人")
    @PostMapping("addWatcher")
    public Watcher addWatcher(@RequestBody Watcher watcher){
        watcher.getMovies().forEach(movie -> {
            movie.setId(UUID.randomUUID().toString());
//            movie.setMovie(findOneMovie(movie.getId()));
//            movie.setTime(Optional.of(movie.getTime()).orElse("1970年1月1日 00:00:00"));
//            movie.set
        });
        return watcherRepository.save(watcher);
    }



    @ApiOperation("建立导演关系")
    @GetMapping("/directed/{personId}/{movieId}")
    public Directed directed(@PathVariable("personId")String personId, @PathVariable("movieId")String movieId){
        Person person = findOnePerson(personId);
        Movie movie = findOneMovie(movieId);
        Directed directed = new Directed();
        directed.setPerson(person);
        directed.setMovie(movie);
        directed.setId(UUID.randomUUID().toString());
        return directedRepository.save(directed);
    }

    @ApiOperation("建立演出关系")
    @GetMapping("/actedIn/{personId}/{movieId}")
    public ActedIn actedIn(@PathVariable("personId")String personId, @PathVariable("movieId")String movieId){
        Person person = findOnePerson(personId);
        Movie movie = findOneMovie(movieId);
        ActedIn actedIn=new ActedIn();
        actedIn.setRoles("龙套");
        actedIn.setPerson(person);
        actedIn.setMovie(movie);
        actedIn.setId(UUID.randomUUID().toString());
        return actedInRepository.save(actedIn);
    }

}

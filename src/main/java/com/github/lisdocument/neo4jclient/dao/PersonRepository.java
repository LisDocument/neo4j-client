package com.github.lisdocument.neo4jclient.dao;

import com.github.lisdocument.neo4jclient.bean.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * <br>-lastModify:2019/7/11 20:01
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface PersonRepository extends Neo4jRepository<Person, String> {

}

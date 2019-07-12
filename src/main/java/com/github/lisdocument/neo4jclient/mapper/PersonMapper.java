package com.github.lisdocument.neo4jclient.mapper;

import com.github.lisdocument.neo4jclient.bean.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <br>-lastModify:2019/7/12 14:51
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface PersonMapper {

    List<Person> findByName(@Param("name") String name);
}

package com.github.lisdocument.neo4jclient.bean;

import lombok.Data;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * <br>-lastModify:2019/7/11 20:48
 *
 * @author Lixiaoban
 * @version 1.0
 */
@NodeEntity("电影")
@Data
public class Movie {

    @Id
    private String id;

    @Property("name")
    private String name;

    @Property("content")
    private String content;
}

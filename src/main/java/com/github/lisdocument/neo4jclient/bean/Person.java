package com.github.lisdocument.neo4jclient.bean;

import lombok.Data;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * <br>-lastModify:2019/7/11 19:55
 *
 * @author Lixiaoban
 * @version 1.0
 */
@Data
@NodeEntity("人员")
public class Person {

    @Id
    private String id;

    @Property("name")
    private String name;

    @Property("address")
    private String add;
}

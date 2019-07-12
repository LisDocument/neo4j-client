package com.github.lisdocument.neo4jclient.bean;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * <br>-lastModify:2019/7/11 22:00
 *
 * @author Lixiaoban
 * @version 1.0
 */
@RelationshipEntity(type = "出演")
@Data
public class ActedIn {

    @Id
    private String id;

    @Property(name = "roles")
    private String roles;

    @StartNode
    private Person person;

    @EndNode
    private Movie movie;
}

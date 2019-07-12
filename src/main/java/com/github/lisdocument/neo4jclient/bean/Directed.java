package com.github.lisdocument.neo4jclient.bean;

import lombok.Data;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * <br>-lastModify:2019/7/11 21:29
 *
 * @author Lixiaoban
 * @version 1.0
 */
@RelationshipEntity(type = "导演")
@Data
public class Directed {

    @Id
    private String id;

    @StartNode
    private Person person;

    @EndNode
    private Movie movie;
}

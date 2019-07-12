package com.github.lisdocument.neo4jclient.bean;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * <br>-lastModify:2019/7/11 23:19
 *
 * @author Lixiaoban
 * @version 1.0
 */
@RelationshipEntity(type = "观影")
@Data
public class Watched {

    @Id
    private String id;

    @Property("time")
    private String time;

    @StartNode
    private Watcher watcher;

    @EndNode
    private Movie movie;
}

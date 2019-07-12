package com.github.lisdocument.neo4jclient.bean;

import com.google.common.collect.Lists;
import lombok.Data;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * <br>-lastModify:2019/7/11 23:11
 *
 * @author Lixiaoban
 * @version 1.0
 */
@NodeEntity("观影人")
@Data
public class Watcher {

    @Id
    private String id;

    @Property("lastLookDate")
    private String lastLookDate;

    @Property("nickName")
    private String nickName;

    @Relationship(type = "观影")
    private List<Movie> movies = Lists.newArrayList();
}

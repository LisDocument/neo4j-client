package com.github.lisdocument.neo4jclient.dao;

import com.github.lisdocument.neo4jclient.bean.Watched;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * <br>-lastModify:2019/7/11 23:21
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface WatchedRepository extends Neo4jRepository<Watched, String> {
}

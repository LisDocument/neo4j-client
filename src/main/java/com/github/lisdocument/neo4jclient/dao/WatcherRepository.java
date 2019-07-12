package com.github.lisdocument.neo4jclient.dao;

import com.github.lisdocument.neo4jclient.bean.Watcher;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * <br>-lastModify:2019/7/11 23:22
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface WatcherRepository extends Neo4jRepository<Watcher, String> {
}

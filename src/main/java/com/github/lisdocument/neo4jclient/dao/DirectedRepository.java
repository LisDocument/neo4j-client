package com.github.lisdocument.neo4jclient.dao;

import com.github.lisdocument.neo4jclient.bean.Directed;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * <br>-lastModify:2019/7/11 22:04
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface DirectedRepository extends Neo4jRepository<Directed, String> {
}

package com.github.lisdocument.neo4jclient.dao;

import com.github.lisdocument.neo4jclient.bean.ActedIn;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * <br>-lastModify:2019/7/11 22:03
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface ActedInRepository extends Neo4jRepository<ActedIn, String> {
}

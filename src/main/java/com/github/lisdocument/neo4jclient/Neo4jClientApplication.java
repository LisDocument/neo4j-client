package com.github.lisdocument.neo4jclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "com.github.lisdocument.neo4jclient.dao")
public class Neo4jClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Neo4jClientApplication.class, args);
    }

}

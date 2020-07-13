package org.zjl.spring.cloud.tutoiral.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Junlin Zhou
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
    public static void main(String[] arguments) {
        SpringApplication.run(ConfigServer.class, arguments);
    }
}

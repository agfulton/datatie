package org.datatie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    @Autowired
    private Config config;

    @Override
    public void run(String ... args) {
        LOGGER.info(config.getMessage());
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

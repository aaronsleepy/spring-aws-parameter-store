package org.socurites.aws.parameterstore.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ParameterResolveDemo implements CommandLineRunner {
    @Value("${message}")
    private String message;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Message property: " + message);
    }
}

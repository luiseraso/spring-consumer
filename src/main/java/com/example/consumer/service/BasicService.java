package com.example.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Lazy
public class BasicService {

    private static final int MIN = 0;
    private static final int MAX = 10000;

    private static final Logger LOGGER = LoggerFactory.getLogger(BasicService.class);

    private String name = "default";
    private int executions = 0;

    public BasicService() {
        LOGGER.info("BasicService()");
    }

    public Integer randomInteger() {
        LOGGER.info("randomInteger()");
        Random random = new Random();
        incrementExecution();
        return random.nextInt(MAX - MIN) + MIN;
    }

    private void incrementExecution() {
        executions++;
        LOGGER.info("EXECUTION: {}", executions);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

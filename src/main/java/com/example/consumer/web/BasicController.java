package com.example.consumer.web;

import com.example.consumer.service.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/basic")
@Lazy
public class BasicController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BasicController.class);

    private final BasicService basicService;

    public BasicController(BasicService basicService) {
        LOGGER.info("BasicController()");
        this.basicService = basicService;
    }

    @GetMapping("/random")
    public Integer getRandomInteger() {
        LOGGER.info("getRandomInteger()");
        return basicService.randomInteger();
    }

    @GetMapping("/name")
    public String getName() {
        LOGGER.info("getName()");
        return basicService.getName();
    }

    @PutMapping("/name/{name}")
    public String updateName(@PathVariable String name) {
        LOGGER.info("updateName(): {}", name);
        basicService.setName(name);
        return basicService.getName();
    }
}

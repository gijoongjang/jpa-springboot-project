package com.jpa.spingboot.controller;

import com.jpa.spingboot.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto dto(@RequestParam("name") String name, @RequestParam("age") int age) {
        return new HelloResponseDto(name, age);
    }
}

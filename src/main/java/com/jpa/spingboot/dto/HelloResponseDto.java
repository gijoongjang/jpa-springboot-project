package com.jpa.spingboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public class HelloResponseDto {

    private String name;
    private int age;
}

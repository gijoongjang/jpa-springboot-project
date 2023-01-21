//package com.jpa.spingboot;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import static org.hamcrest.Matchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest
//public class HelloControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void test() throws Exception {
//        String hello = "hello";
//
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(hello));
//    }
//
//    @Test
//    public void lombokTest() throws Exception{
//        String name = "장기중";
//        int age = 26;
//
////        HelloResponseDto hrd = new HelloResponseDto(name, age);
////
////        assertThat(hrd.getName()).isEqualTo(name);
////        assertThat(hrd.getAge()).isEqualTo(age);
//
//        mockMvc.perform(get("/hello/dto")
//                .param("name", name)
//                .param("age", String.valueOf(age)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name", is(name)))
//                .andExpect(jsonPath("$.age", is(age)));
//    }
//}

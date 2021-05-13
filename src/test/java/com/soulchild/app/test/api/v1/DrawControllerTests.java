package com.soulchild.app.test.api.v1;


import com.soulchild.app.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest
public class DrawControllerTests {

//    @Autowired
//    private MockMvc mvc;
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Test
//    public void hello_return() throws Exception{
//        String hello = "Hello";
//        mvc.perform(get("/hello"))
//            .andExpect(status().isOk())
//            .andExpect(content().string(hello));
//
//    }
//
//    @Test
//    public void lombok_test(){
//        String name = "test";
//        int amount = 1000;
//
//    }

}

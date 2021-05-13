package com.soulchild.app.test.api.v1;

import com.soulchild.app.domain.User;
import com.soulchild.app.dto.UserResponseDto;
import com.soulchild.app.dto.UserSaveRequestDto;
import com.soulchild.app.repository.UserRepository;
import com.soulchild.app.service.UserService;
import org.apache.tomcat.util.log.UserDataHelper;
import org.junit.After;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRepositoryTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @DisplayName("수행전 데이터 삭제")
    @After
    public void cleanup(){
        userRepository.deleteAll();
    }

    @DisplayName("유저 등록")
    @Test
    public void save(){
        String id = "hayoon_ku";
        String name = "KU_HAYOON";

        UserSaveRequestDto dto = UserSaveRequestDto.builder().name(name).id(id).build();

        String url = "http://localhost:8080" + "/api/v1/user/add";

        List<User> userList = userRepository.findAll();
        ResponseEntity<User> responseEntity = restTemplate.postForEntity(url , dto , User.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody());

        User user = userList.get(0);
        assertThat(userList.size()).isGreaterThan(0);

    }

    @DisplayName("유저 조회")
    @Test
    public void read(){
        UserResponseDto dto = userService.findById(16L);
        assertThat(dto).isNotNull();
    }

    @DisplayName("유저 업데이트")
    @Test
    public void update(){

    }

    @DisplayName("베이스 타임 업데이트")
    @Test
    public void BaseTimeUpdate(){
        LocalDateTime now = LocalDateTime.of(2021 , 5 , 13 , 0 , 0 , 0);
        userRepository.save(User.builder().name("test123333").id("test1234141441").build());

        List<User> userList = userRepository.findAll();
        User user = userList.get(3);

        System.out.println("#CREATE_TIME :" + user.getCreateDate());
        System.out.println("#MODIFIED_TIME :" + user.getModifiedDate());


    }


}

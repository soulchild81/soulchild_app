package com.soulchild.app.web.api.v1;

//import com.soulchild.app.domain.User;
//import com.soulchild.app.dto.UserResponseDto;
//import com.soulchild.app.dto.UserSaveRequestDto;
import com.soulchild.app.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/")
public class UserController {

    //private final UserService userService;

//    @PutMapping("user/add")
//    public Long save(@RequestBody UserSaveRequestDto requestDto){
//        return userService.save(requestDto);
//    }
//
//    @PutMapping("user/{user_id}")
//    public Long update(@PathVariable Long user_id , @RequestBody UserSaveRequestDto requestDto){
//        userService.update(user_id , requestDto);
//        return null;
//    }
//
//    @GetMapping("user/{user_id}")
//    public UserResponseDto getUser(@PathVariable Long user_id){
//        return userService.findById(user_id);
//    }
}

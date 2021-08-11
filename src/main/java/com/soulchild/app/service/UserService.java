//package com.soulchild.app.service;
//
//import com.soulchild.app.domain.User;
//import com.soulchild.app.dto.UserResponseDto;
//import com.soulchild.app.dto.UserSaveRequestDto;
//import com.soulchild.app.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@RequiredArgsConstructor
//@Service
//public class UserService {
//    private final UserRepository userRepository;
//
//    public Long save(UserSaveRequestDto requestDto){
//        return userRepository.save(requestDto.toEntity()).getUser_id();
//    }
//
//    public Optional<User> update(Long user_id , UserSaveRequestDto requestDto){
//        Optional<User> user = userRepository.findById(user_id);
//        user.ifPresent(selectuser -> {
//            selectuser.setUser_id(user_id);
//            selectuser.setId(requestDto.getId());
//            selectuser.setName(requestDto.getName());
//            userRepository.save(selectuser);
//        });
//
//        return user;
//    }
//
//    public UserResponseDto findById(Long user_id){
//        User entity = userRepository.findById(user_id).orElseThrow(() -> new IllegalArgumentException("NONE USER 2: " + user_id));
//        return new UserResponseDto(entity);
//    }
//}

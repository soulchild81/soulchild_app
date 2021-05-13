package com.soulchild.app.dto;

import com.soulchild.app.domain.User;
import lombok.Data;
import lombok.Getter;

@Data
public class UserResponseDto {
    private Long user_id;
    private String name;
    private String id;

    public UserResponseDto(User entity){
        this.user_id = entity.getUser_id();
        this.name = entity.getName();
        this.id = entity.getId();
    }
}

package com.soulchild.app.dto;

import com.soulchild.app.domain.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
    private Long user_id;
    private String name;
    private String id;

    @Builder
    public UserSaveRequestDto(String name , String id){
        this.name = name;
        this.id = id;
    }

    public User toEntity(){
        return User.builder().name(name).id(id).build();
    }
}

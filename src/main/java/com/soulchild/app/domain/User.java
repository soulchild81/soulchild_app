//package com.soulchild.app.domain;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
////엔티티 클래스를 요청과 응답 클래스로 사용하면 안됨
////DB 의 속성과 연결 되어 있기때문
////View 레이어와 Db 레이어를 분리하는것이 좋음
//@NoArgsConstructor
//@Entity
//@Getter
//@Setter
//public class User extends BaseTimeEntity{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long user_id;
//
//    @Column(length=255 , nullable = true)
//    private String id;
//
//    @Column(length=255 , nullable = true)
//    private String name;
//
//    @Builder
//    public User(String id , String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    public void update(Long user_id , String id, String name) {
//        this.user_id = user_id;
//        this.id = id;
//        this.name = name;
//    }
//}

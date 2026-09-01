package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users") // MySQL에 users라는 이름의 테이블 생성
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
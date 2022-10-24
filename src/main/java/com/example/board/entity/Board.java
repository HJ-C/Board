package com.example.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data //controller에서 매개변수로 사용 할 수 있게 해주며 관련 내장 함수들 사용가능
public class Board {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mariaDB
    private Integer id;

    private String title;

    private String content;
}

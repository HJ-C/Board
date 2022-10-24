package com.example.board.service;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired//dependency injection
    private BoardRepository boardRepository; //Autowired의 어노테이션 때문에 new객체 생성 안해도 됨

    public void write(Board board){
        boardRepository.save(board); //entity주입
    }
}

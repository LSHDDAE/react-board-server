package com.react.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.board.model.Board;
import com.react.board.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	public List<Board> getAllBoard(){
		return boardRepository.findAll();
	}
	
	public void insertBoard (Board board) {
		boardRepository.save(board);
	}
}

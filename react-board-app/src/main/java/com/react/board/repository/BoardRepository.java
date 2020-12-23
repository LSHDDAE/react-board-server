package com.react.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.board.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {
	
}
				
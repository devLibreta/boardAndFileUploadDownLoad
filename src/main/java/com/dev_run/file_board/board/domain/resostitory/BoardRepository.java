package com.dev_run.file_board.board.domain.resostitory;

import com.dev_run.file_board.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {
}

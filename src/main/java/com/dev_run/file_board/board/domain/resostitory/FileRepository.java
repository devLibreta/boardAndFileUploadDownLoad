package com.dev_run.file_board.board.domain.resostitory;

import com.dev_run.file_board.board.domain.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}

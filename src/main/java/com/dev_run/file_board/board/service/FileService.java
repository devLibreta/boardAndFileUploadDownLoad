package com.dev_run.file_board.board.service;

import com.dev_run.file_board.board.domain.File;
import com.dev_run.file_board.board.domain.resostitory.FileRepository;
import com.dev_run.file_board.board.dto.FileDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileRepository fileRepository;

    @Transactional
    public Long saveFile(FileDto fileDto){
        return  fileRepository.save(fileDto.toEntity()).getId();
    }
    @Transactional
    public FileDto getFile(Long id) {
        File file = fileRepository.findById(id).orElseThrow(RuntimeException::new);

        return FileDto.builder()
                .id(id)
                .origFilename(file.getOrigFilename())
                .filename(file.getFilename())
                .filePath(file.getFilePath())
                .build();
    }
}

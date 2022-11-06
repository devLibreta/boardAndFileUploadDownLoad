package com.dev_run.file_board.board.dto;

import com.dev_run.file_board.board.domain.File;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FileDto {
    private Long id;
    private String origFilename;
    private String filename;
    private String filePath;

    public File toEntity() {
        return File.builder()
                .id(id)
                .origFilename(origFilename)
                .filename(filename)
                .filePath(filePath)
                .build();
    }

    @Builder
    public FileDto(Long id, String origFilename, String filename, String filePath) {
        this.id = id;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }
}

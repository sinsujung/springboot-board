package com.project.board.service;

import com.project.board.dto.BoardDTO;
import com.project.board.entity.BoardEntity;
import com.project.board.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


// DTO -> Entity (in Entity Class)
// Entity -> DTO (in DTO Class)
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}

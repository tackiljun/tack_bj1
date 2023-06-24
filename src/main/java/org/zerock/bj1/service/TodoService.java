package org.zerock.bj1.service;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj1.dto.PageRequestDTO;
import org.zerock.bj1.dto.PageResponseDTO;
import org.zerock.bj1.dto.TodoDTO;

@Transactional
public interface TodoService {
  
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

}

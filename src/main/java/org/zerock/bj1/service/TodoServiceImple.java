package org.zerock.bj1.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.bj1.dto.PageRequestDTO;
import org.zerock.bj1.dto.PageResponseDTO;
import org.zerock.bj1.dto.TodoDTO;
import org.zerock.bj1.mappers.TodoMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImple implements TodoService{

  private final TodoMapper todoMapper;

  @Override
  public PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO){

    List<TodoDTO> list = todoMapper.list(pageRequestDTO);
    long totalCount = todoMapper.listCount(pageRequestDTO);


    return null;
  }
  
}

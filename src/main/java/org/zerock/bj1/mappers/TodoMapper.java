package org.zerock.bj1.mappers;

import java.util.List;

import org.zerock.bj1.dto.PageRequestDTO;
import org.zerock.bj1.dto.TodoDTO;

public interface TodoMapper {
  
  int insert(TodoDTO todoDTO); 

  //1376227
  TodoDTO selectOne(Long tno);

  List<TodoDTO> list(PageRequestDTO pageRequestDTO);

  long listCount(PageRequestDTO pageRequestDTO);

}

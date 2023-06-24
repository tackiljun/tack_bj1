package org.zerock.b1.mappers;

import java.io.Console;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj1.dto.PageRequestDTO;
import org.zerock.bj1.dto.TodoDTO;
import org.zerock.bj1.mappers.TodoMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TodoMapperTest {
  
  @Autowired(required = false)
  private TodoMapper todoMapper;

  @Transactional
  @Commit
  @Test
  public void testInsert(){

    Assertions.assertNotNull(todoMapper, "Todo mapper");

    TodoDTO todoDTO = TodoDTO.builder()
    .title("테스트 투두")
    .content("Test Content")
    .writer("user11")
    .dueDate("2023-06-07")
    .build();

    int count = todoMapper.insert(todoDTO);

    Assertions.assertEquals(count, 1);

    log.info("====================");
    log.info(todoDTO.getTno());
    log.info("====================");

  }

  @Test
  public void testSelectOne() {

    log.info( todoMapper.selectOne(1376227L));

  }

  
  @Test
  public void testList() {

    PageRequestDTO dto = PageRequestDTO.builder().build();
    List<TodoDTO> list = todoMapper.list(dto);

    list.forEach(todo -> log.info(todo));
  }


  @Test
  public void testListCount() {

    PageRequestDTO dto = PageRequestDTO.builder().build();
    long totalCount = todoMapper.listCount(dto);


    log.info("-----------------------------------");
    log.info("-----------------------------------");
    log.info(totalCount);
    log.info("-----------------------------------");
    log.info("-----------------------------------");
  }



}
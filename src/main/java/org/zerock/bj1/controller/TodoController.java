package org.zerock.bj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
@RequestMapping("/todo/")
public class TodoController {


    // list.
    @GetMapping("list")
    public void list(){
        log.info("list!!!!!");
    }


    @GetMapping("add")
    public void add(){
        log.info("Add!!!!!");
    }


    @PostMapping("add")
    public String addPost(){
        log.info("Add Post!!!!!");
        return "redirect:/todo/list";
    }


    @GetMapping("read/{tno}")
    public String Read(@PathVariable("tno") Long tno){
        log.info("GET read!!!!!");

        return "/todo/read";
    }


    @GetMapping("modify/{tno}")
    public String Modify(@PathVariable("tno") Long tno){
        log.info("GET modify!!!!!");

        return "/todo/modify";
    }


    @PostMapping("remove")
    public String removePost(){
        log.info("Remove Post!!!!!");
        return "redirect:/todo/list";
    }


    @PostMapping("modify/{tno}")
    public String modifyPost(@PathVariable("tno") Long tno){
        log.info("Remove Post!!!!!");
        return "redirect:/todo/read/" + tno;
    }


    
}
package org.yunhj.todoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yunhj.todoApp.dto.TodoListDto;
import org.yunhj.todoApp.service.TodoListServiceImpl;

import java.util.List;

/**
 * todoList 관련 컨트롤러
 * 담당자 : 윤현지
 */

@RestController
public class TodoListController {

    @Autowired
    TodoListServiceImpl todoListService;

    /** 리스트 표출 기능 */
    @GetMapping("/getList")
    public List<TodoListDto> getList(TodoListDto todoListDto){
        return todoListService.selectTodoList(todoListDto);
    }

    /** 일정 추가 기능 */
    @PostMapping("/insertTodo")
    public boolean insertTodo(@RequestBody TodoListDto todoListDto){
        return todoListService.createTodo(todoListDto);
    }


    /** 일정 수정 기능 */
    @PostMapping("/updateTodo")
    public boolean updateTodo(@RequestBody TodoListDto todoListDto){
        return todoListService.updateTodo(todoListDto);
    }


    /** 일정 삭제 기능 */
    @PostMapping("/deleteTodo")
    public boolean deleteTodo(@RequestBody TodoListDto todoListDto){
        return todoListService.deleteTodo(todoListDto);
    }


    /** 일정 완료 기능 */
    @PostMapping("/completeTodo")
    public boolean completeTodo(@RequestBody TodoListDto todoListDto){
        return todoListService.completeTodo(todoListDto);
    }

}

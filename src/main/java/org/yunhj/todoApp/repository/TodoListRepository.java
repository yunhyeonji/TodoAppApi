package org.yunhj.todoApp.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.yunhj.todoApp.dto.TodoListDto;

import java.util.List;

@Mapper
@Repository
public interface TodoListRepository {
    /* 일정 리스트 select */
    List<TodoListDto> selectTodoList(TodoListDto todoListDto);

    /* 일정 추가 기능 */
    int createTodo(TodoListDto todoListDto);

    /* 일정 수정 기능 */
    int updateTodo(TodoListDto todoListDto);

    /* 일정 삭제 기능 */
    int deleteTodo(TodoListDto todoListDto);
}

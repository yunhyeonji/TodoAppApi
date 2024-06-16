package org.yunhj.todoApp.service;

import org.yunhj.todoApp.dto.TodoListDto;

import java.util.List;

public interface TodoListService {

    /** 사용자, 날짜별 리스트 표출 */
    List<TodoListDto> selectTodoList(TodoListDto todoListDto);

    /** 일정 생성 */
    boolean createTodo(TodoListDto todoListDto);

    /** 일정 수정 */
    boolean updateTodo(TodoListDto todoListDto);

    /** 일정 삭제 */
    boolean deleteTodo(TodoListDto todoListDto);

    /** 일정 완료 */
    boolean completeTodo(TodoListDto todoListDto);
}

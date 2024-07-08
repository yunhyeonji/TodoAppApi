package org.yunhj.todoApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yunhj.todoApp.dto.TodoListDto;
import org.yunhj.todoApp.repository.TodoListRepository;

import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService{

    @Autowired
    TodoListRepository todoListRepository;

    /** 사용자별 리스트 표출 기능 */
    @Override
    public List<TodoListDto> selectTodoList(TodoListDto todoListDto) {
        return todoListRepository.selectTodoList(todoListDto);
    }

    @Override
    public TodoListDto selectPercentage(TodoListDto todoListDto) {
        return todoListRepository.selectPercentage(todoListDto);
    }

    /** todolist 추가 기능 */
    @Override
    public boolean createTodo(TodoListDto todoListDto) {
        if(todoListRepository.createTodo(todoListDto) == 1){
            return true;
        }
        return false;
    }

    /** todolist 수정 기능 */
    @Override
    public boolean updateTodo(TodoListDto todoListDto) {
        if(todoListRepository.updateTodo(todoListDto) == 1){
            return true;
        }
        return false;
    }

    /** todolist 삭제 기능 */
    @Override
    public boolean deleteTodo(TodoListDto todoListDto) {
        if(todoListRepository.deleteTodo(todoListDto) == 1){
            return true;
        }
        return false;
    }

    /** todolist 완료 기능 */
    @Override
    public boolean completeTodo(TodoListDto todoListDto) {
        if(todoListRepository.updateTodo(todoListDto) == 1){
            return true;
        }
        return false;
    }
}

package org.yunhj.todoApp.dto;

import lombok.Data;

@Data
public class TodoListDto {
    /** todoList id */
    private int id;

    /** todoList 제목 */
    private String title;

    /** todoList 내용 */
    private String TEXT;

    /** todoList 완료유무 */
    private boolean is_completed;

    /** todoList 완료일자 */
    private String reminder_time;
}

package org.yunhj.todoApp.dto;

import lombok.Data;

@Data
public class TodoListDto {

    /** todoList 이용자 seq */
    private int userSeq;

    /** todoList id */
    private int id;

    /** todoList 제목 */
    private String title;

    /** todoList 내용 */
    private String description;

    /** todoList 완료유무 */
    private boolean completed;

    /** todoList 완료일자 */
    private String reminderTime;

}

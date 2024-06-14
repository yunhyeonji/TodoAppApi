package org.yunhj.todoApp.dto;

import lombok.Data;

@Data
public class ResponseDto {
    private String status;
    private String errorMessage;
    private Object data;

    public ResponseDto(String status, String errorMessage, Object data) {
        this.status = status;
        this.errorMessage = errorMessage;
        this.data = data;
    }
}

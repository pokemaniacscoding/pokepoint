package com.pokepoint.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;
    private String field;
    private String message;
    private Long timeStamp;

    public StandardError(Integer status, String message, Long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public StandardError(Integer status, String field, String message, Long timeStamp) {
        this.status = status;
        this.field = field;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getField() {
        return field;
    }
}

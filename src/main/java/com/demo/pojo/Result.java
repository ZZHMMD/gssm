package com.demo.pojo;

public class Result {

    private boolean status;

    private String message;

    private Object data;

    public Result(boolean status,String message,Object data){
        this.status =status;
        this.message=message;
        this.data=data;
    }

    public Result(Object object){
        this.data = object;
        this.status = true;
        this.message="success";
    }

    public Result(boolean status){
        this.data = null;
        this.status = status;
        this.message=null;
    }

    public Result(boolean status,String message){
        this.data =null;
        this.status = status;
        this.message=message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

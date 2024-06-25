package com.utils;

import org.json.JSONObject;

public class BaseResponse {
    private JSONObject json;
    private int code;
    private String message;

    public BaseResponse() {
        this.json = new JSONObject();
    }

    public BaseResponse(int code, String message) {
        this.json = new JSONObject();
        this.code = code;
        this.message = message;
        this.json.put("code", code);
        this.json.put("message", message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JSONObject getJson() {
        return json;
    }

    public void setJson(JSONObject json) {
        this.json = json;
    }

    public String toString() {
        return json.toString();
    }

}

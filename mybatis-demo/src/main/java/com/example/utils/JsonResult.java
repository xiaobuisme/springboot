package com.example.utils;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Map;

/**
 * 统一返回结果封装
 * @param <T>
 */
@JsonSerialize
public class JsonResult<T>  implements Serializable {

    private static final long serialVersionUID = -1L;

    private static String code;
    private static String status;
    private static String message;
    private T data;
    private static Map<String, Object> errors;

    public JsonResult(){}

    public JsonResult(String message, T data){
        this.message = message;
        this.code = "200";
        this.data = data;
        this.message = "成功";
    }

    public static JsonResult okJsonResult() {
        JsonResult result = new JsonResult();
        result.setCode("200");
        result.setStatus("ok");
        result.setMessage("成功");
        return result;
    }

    public JsonResult okJsonResultWithData(T data) {
        JsonResult result = okJsonResult();
        result.setData(data);
        return result;
    }

    public static JsonResult okJsonResultWithMsg(String meassage) {
        JsonResult result = okJsonResult();
        result.setMessage(message);
        return result;
    }

    public static JsonResult failJsonResult() {
        JsonResult result = new JsonResult();
        result.setCode("500");
        result.setStatus("failed");
        result.setMessage("失败");
        return result;
    }

    public static JsonResult failJsonResultWithMsg(String meassage) {
        JsonResult result = failJsonResult();
        result.setMessage(message);
        return result;
    }

    public static JsonResult failJsonResultWithError(Map<String, Object> errors) {
        JsonResult result = failJsonResult();
        result.setErrors(errors);
        return result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Map<String, Object> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }

}

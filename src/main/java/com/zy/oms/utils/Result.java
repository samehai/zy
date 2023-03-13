package com.zy.oms.utils;
import java.io.Serializable;
import java.util.List;

public class Result<T> implements Serializable{
    private static final long serialVersionUID = -3960261604608758516L;
    private int code;
    private String msg;
    private List<T> data;
    public static <T> Result<T> success() {
        return new Result<T>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * 成功,默认状态码,返回消息,自定义返回数据
     * @param data 自定义返回数据
     * @param <T>  返回类泛型,不能为String
     * @return 通用返回Result
     */
    public static <T> Result<T> success(List<T> data) {
        return new Result<T>(data);
    }

    /**
     * 成功,默认状态码,自定义返回消息,返回数据
     * @param msg  自定义返回消息
     * @param data 自定义返回数据
     * @param <T>  返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> success(String msg, List<T> data) {
        return new Result<T>(msg, data);
    }
    /**
     * 成功,默认状态码,自定义返回消息,无返回数据
     *
     * @param msg 自定义返回消息
     * @param <T> 返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> success(String msg) {
        return new Result<T>(msg);
    }
    /**
     * 失败,默认状态码,返回消息,无返回数据
     * @param <T> 返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> error() {
        return new Result<T>(ResultCode.ERROR);
    }
    /**
     * 失败,默认状态码,自定义返回消息,无返回数据
     * @param <T> 返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> error(String msg) {
        return new Result<T>(ResultCode.ERROR.getCode(), msg);
    }
    /**
     * 失败,自定义状态码,返回消息,无返回数据
     * @param code 自定义状态码
     * @param msg  自定义返回消息
     * @param <T>  返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> error(int code, String msg) {
        return new Result<T>(code, msg);
    }
    /**
     * 失败,使用CodeMsg状态码,返回消息,无返回数据
     * @param resultCode CodeMsg,参数如下:
     *                   <p> code 状态码
     *                   <p> msg  返回消息
     * @param <T>        返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> error(ResultCode resultCode) {
        return new Result<T>(resultCode);
    }
    /**
     * 成功构造器,无返回数据
     */
    private Result() {
        this(ResultCode.SUCCESS);
    }
    /**
     * 成功构造器,自定义返回数据
     * @param data 返回数据
     */
    private Result(List<T> data) {
        this(ResultCode.SUCCESS, data);
    }
    /**
     * 成功构造器,自定义返回消息,无返回数据
     * @param msg 返回消息
     */
    private Result(String msg) {
        this(ResultCode.SUCCESS.getCode(), msg);
    }
    /**
     * 构造器,自定义状态码,返回消息
     * @param code 状态码
     * @param msg  返回消息
     */
    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    /**
     * 成功构造器,自定义返回信息,返回数据
     * @param msg  返回信息
     * @param data 返回数据
     */
    private Result(String msg, List<T> data) {
        this(ResultCode.SUCCESS.getCode(), msg, data);
    }

    /**
     * 构造器,自定义状态码,返回消息,返回数据
     * @param code 状态码
     * @param msg  返回消息
     * @param data 返回数据
     */
    private Result(int code, String msg, List<T> data) {
        this(code, msg);
        this.data = data;
    }
    /**
     * 构造器,使用CodeMsg状态码与返回信息,自定义返回数据
     * @param resultCode CodeMsg,参数如下:
     *                   <p> code 状态码
     *                   <p> msg  返回消息
     * @param data       返回数据
     */
    private Result(ResultCode resultCode, List<T> data) {
        this(resultCode);
        this.data = data;
    }

    /**
     * 构造器,使用CodeMsg状态码与返回信息
     * @param resultCode CodeMsg,参数如下:
     *                   <p> code 状态码
     *                   <p> msg  返回消息
     */
    private Result(ResultCode resultCode) {
        this(resultCode.getCode(), resultCode.getMsg());
    }
}

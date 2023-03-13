package com.zy.oms.utils;

public enum ResultCodeEnum {
  SUCCESS(200,"成功"),
  ERROR(500,"网络异常"),

  /* 参数错误：1000～1999 */
  PARAM_NOT_VALID(1001, "参数无效"),
  PARAM_IS_BLANK(1003, "参数为空"),
  PARAM_TYPE_ERROR(1005, "参数类型错误"),
  PARAM_NOT_COMPLETE(1007, "参数缺失"),
  BIZ_ERROR(1011,"通用业务异常"),
  FILE_OUT_MAX(1013,"文件超出最大限制"),
  FILE_FORMAT_ERROR(1015,"文件格式不正确"),
  PARAM_ERROR(1017,"参数错误"),
  JSON_FORMAT_ERROR(1019,"Json解析异常"),
  SQL_ERROR(1021,"Sql解析异常"),
  NETWORK_TIMEOUT(1023,"网络超时"),
  UNKNOWN_INTERFACE(1025,"未知的接口"),
  REQ_MODE_NOT_SUPPORTED(1027,"请求方式不支持"),
  SYS_ERROR(9999,"严重系统错误");

  ResultCodeEnum(int code, String msg) {
    this.code = code;
    this.msg = msg;
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
  /** 状态码 */
  private int code;
  /** 状态信息 */
  private String msg;

  /**
   * 根据code获取message
   *
   * @param code 状态码
   * @return msg
   */
  public static String getMsgByCode(Integer code) {
    for (ResultCodeEnum ele : values()) {
      if (ele.getCode() == code) {
        return ele.getMsg();
      }
    }
    return null;
  }
}

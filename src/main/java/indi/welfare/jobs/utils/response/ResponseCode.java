package indi.welfare.jobs.utils.response;

import lombok.AllArgsConstructor;
import lombok.Data;

public enum ResponseCode {

    SUCCESS(200, "success"),
    RESOURCES_NOT_EXIST(404, "资源不存在"),
    SERVICE_ERROR(500, "服务器异常");

    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

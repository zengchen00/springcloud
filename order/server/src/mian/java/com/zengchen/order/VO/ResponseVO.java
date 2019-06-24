package com.zengchen.order.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 */
@Data
public class ResponseVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;

    public static ResponseVO success(Object data){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(0);
        responseVO.setData(data);
        responseVO.setMsg("OK");
        return responseVO;
    }
}

package com.bdqn.SpringCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 曾建波
 * @date: 2020-10-22
 * @description: 如果前后端分离，这个是提供给前端信息和数据的类（封装JSON数据的实体类）
 * @version: 1.0
 * @since: JDK1.8
 * @packageName: com.bdqn.SpringCloud.entities
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;//数字编码例如：404 前端直接判断
    private String messgae;//异常信息或者成功说明
    private T data;

    /**
     * 查询为空的时候使用的构造器
     *
     * @param code
     * @param messgae
     */
    public CommonResult(Integer code, String messgae) {
        this(code, messgae, null);
    }
}

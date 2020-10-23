package com.bdqn.SpringCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 曾建波
 * @date: 2020-10-22
 * @description: 实体类
 * @version: 1.0
 * @since: JDK1.8
 * @packageName: com.bdqn.SpringCloud.entities
 */

//这里面的 lombok 这个包，引入以后，实体类不用再写set 和 get
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}


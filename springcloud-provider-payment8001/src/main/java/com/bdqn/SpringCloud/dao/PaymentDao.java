package com.bdqn.SpringCloud.dao;

import com.bdqn.SpringCloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: 曾建波
 * @date: 2020-10-22
 * @description: 支付持久层
 * @version: 1.0
 * @since: JDK1.8
 * @packageName: com.bdqn.SpringCloud.dao
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

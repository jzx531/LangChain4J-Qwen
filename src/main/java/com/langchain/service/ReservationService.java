package com.langchain.service;

import com.langchain.pojo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;

public interface ReservationService {
    /**
     * 插入订单
     * @param reservation
     */
    void insert(Reservation reservation);

    /**
     * 根据手机号查询
     * @param phone
     * @return
     */
    Reservation findByPhone(String phone);
}

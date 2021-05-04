package com.liangxinyu.springcloud.service;

import com.liangxinyu.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}

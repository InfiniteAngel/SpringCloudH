package com.liangxinyu.springcloud.service.Impl;

import com.liangxinyu.springcloud.dao.PaymentDao;
import com.liangxinyu.springcloud.entities.Payment;
import com.liangxinyu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}

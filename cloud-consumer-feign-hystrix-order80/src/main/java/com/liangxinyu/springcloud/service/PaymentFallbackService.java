package com.liangxinyu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------------------PaymentFallbackService fall back -ok----------------------";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
         return "--------------------PaymentFallbackService fall back -timeout----------------------";
    }
}

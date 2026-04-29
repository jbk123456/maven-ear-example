package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF102 {

    @EJB
    private HelperBeanE102 helperBeanE102;

    public String identify() {
        return "HelperBeanF102";
    }
}

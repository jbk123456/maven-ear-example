package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE102 {

    @EJB
    private HelperBeanD102 helperBeanD102;

    public String identify() {
        return "HelperBeanE102";
    }
}

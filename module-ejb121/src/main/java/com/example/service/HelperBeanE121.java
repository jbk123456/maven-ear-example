package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE121 {

    @EJB
    private HelperBeanD121 helperBeanD121;

    public String identify() {
        return "HelperBeanE121";
    }
}

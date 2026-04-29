package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH111 {

    @EJB
    private HelperBeanG111 helperBeanG111;

    public String identify() {
        return "HelperBeanH111";
    }
}

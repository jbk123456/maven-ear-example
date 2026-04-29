package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG111 {

    @EJB
    private HelperBeanF111 helperBeanF111;

    public String identify() {
        return "HelperBeanG111";
    }
}

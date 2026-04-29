package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI111 {

    @EJB
    private HelperBeanH111 helperBeanH111;

    public String identify() {
        return "HelperBeanI111";
    }
}

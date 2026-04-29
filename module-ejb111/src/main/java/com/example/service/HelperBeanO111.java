package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO111 {

    @EJB
    private HelperBeanN111 helperBeanN111;

    public String identify() {
        return "HelperBeanO111";
    }
}

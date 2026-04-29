package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN111 {

    @EJB
    private HelperBeanM111 helperBeanM111;

    public String identify() {
        return "HelperBeanN111";
    }
}

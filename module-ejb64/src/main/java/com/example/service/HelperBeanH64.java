package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH64 {

    @EJB
    private HelperBeanG64 helperBeanG64;

    public String identify() {
        return "HelperBeanH64";
    }
}

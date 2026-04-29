package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG64 {

    @EJB
    private HelperBeanF64 helperBeanF64;

    public String identify() {
        return "HelperBeanG64";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN38 {

    @EJB
    private HelperBeanM38 helperBeanM38;

    public String identify() {
        return "HelperBeanN38";
    }
}

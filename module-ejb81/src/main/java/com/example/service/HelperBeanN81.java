package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN81 {

    @EJB
    private HelperBeanM81 helperBeanM81;

    public String identify() {
        return "HelperBeanN81";
    }
}

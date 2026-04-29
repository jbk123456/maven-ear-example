package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO81 {

    @EJB
    private HelperBeanN81 helperBeanN81;

    public String identify() {
        return "HelperBeanO81";
    }
}

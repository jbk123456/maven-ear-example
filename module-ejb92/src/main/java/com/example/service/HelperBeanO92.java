package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO92 {

    @EJB
    private HelperBeanN92 helperBeanN92;

    public String identify() {
        return "HelperBeanO92";
    }
}

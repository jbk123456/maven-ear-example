package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN70 {

    @EJB
    private HelperBeanM70 helperBeanM70;

    public String identify() {
        return "HelperBeanN70";
    }
}

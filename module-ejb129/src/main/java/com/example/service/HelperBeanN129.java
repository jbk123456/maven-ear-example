package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN129 {

    @EJB
    private HelperBeanM129 helperBeanM129;

    public String identify() {
        return "HelperBeanN129";
    }
}

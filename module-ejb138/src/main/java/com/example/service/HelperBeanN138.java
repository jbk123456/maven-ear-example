package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN138 {

    @EJB
    private HelperBeanM138 helperBeanM138;

    public String identify() {
        return "HelperBeanN138";
    }
}

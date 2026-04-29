package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN74 {

    @EJB
    private HelperBeanM74 helperBeanM74;

    public String identify() {
        return "HelperBeanN74";
    }
}

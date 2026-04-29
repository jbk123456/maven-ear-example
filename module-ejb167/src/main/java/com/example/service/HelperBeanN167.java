package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN167 {

    @EJB
    private HelperBeanM167 helperBeanM167;

    public String identify() {
        return "HelperBeanN167";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN168 {

    @EJB
    private HelperBeanM168 helperBeanM168;

    public String identify() {
        return "HelperBeanN168";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN142 {

    @EJB
    private HelperBeanM142 helperBeanM142;

    public String identify() {
        return "HelperBeanN142";
    }
}

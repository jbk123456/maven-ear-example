package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN89 {

    @EJB
    private HelperBeanM89 helperBeanM89;

    public String identify() {
        return "HelperBeanN89";
    }
}

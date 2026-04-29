package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN139 {

    @EJB
    private HelperBeanM139 helperBeanM139;

    public String identify() {
        return "HelperBeanN139";
    }
}

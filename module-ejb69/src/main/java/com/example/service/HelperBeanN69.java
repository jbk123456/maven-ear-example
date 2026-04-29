package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN69 {

    @EJB
    private HelperBeanM69 helperBeanM69;

    public String identify() {
        return "HelperBeanN69";
    }
}

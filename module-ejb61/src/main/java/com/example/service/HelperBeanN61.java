package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN61 {

    @EJB
    private HelperBeanM61 helperBeanM61;

    public String identify() {
        return "HelperBeanN61";
    }
}

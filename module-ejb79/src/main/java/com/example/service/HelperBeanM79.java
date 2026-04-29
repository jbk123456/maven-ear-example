package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM79 {

    @EJB
    private HelperBeanL79 helperBeanL79;

    public String identify() {
        return "HelperBeanM79";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM108 {

    @EJB
    private HelperBeanL108 helperBeanL108;

    public String identify() {
        return "HelperBeanM108";
    }
}

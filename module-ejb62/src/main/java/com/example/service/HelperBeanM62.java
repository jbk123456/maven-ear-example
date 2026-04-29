package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM62 {

    @EJB
    private HelperBeanL62 helperBeanL62;

    public String identify() {
        return "HelperBeanM62";
    }
}

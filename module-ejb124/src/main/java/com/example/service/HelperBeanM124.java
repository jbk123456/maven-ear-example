package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM124 {

    @EJB
    private HelperBeanL124 helperBeanL124;

    public String identify() {
        return "HelperBeanM124";
    }
}

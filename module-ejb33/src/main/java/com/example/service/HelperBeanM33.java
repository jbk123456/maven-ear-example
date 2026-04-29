package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM33 {

    @EJB
    private HelperBeanL33 helperBeanL33;

    public String identify() {
        return "HelperBeanM33";
    }
}

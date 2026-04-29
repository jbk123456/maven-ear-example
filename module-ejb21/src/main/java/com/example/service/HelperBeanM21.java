package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM21 {

    @EJB
    private HelperBeanL21 helperBeanL21;

    public String identify() {
        return "HelperBeanM21";
    }
}

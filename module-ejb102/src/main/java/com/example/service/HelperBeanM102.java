package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM102 {

    @EJB
    private HelperBeanL102 helperBeanL102;

    public String identify() {
        return "HelperBeanM102";
    }
}

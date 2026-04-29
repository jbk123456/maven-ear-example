package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM143 {

    @EJB
    private HelperBeanL143 helperBeanL143;

    public String identify() {
        return "HelperBeanM143";
    }
}

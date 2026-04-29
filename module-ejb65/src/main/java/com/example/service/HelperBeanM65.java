package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM65 {

    @EJB
    private HelperBeanL65 helperBeanL65;

    public String identify() {
        return "HelperBeanM65";
    }
}

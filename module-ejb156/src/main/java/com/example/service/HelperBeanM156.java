package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM156 {

    @EJB
    private HelperBeanL156 helperBeanL156;

    public String identify() {
        return "HelperBeanM156";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM117 {

    @EJB
    private HelperBeanL117 helperBeanL117;

    public String identify() {
        return "HelperBeanM117";
    }
}

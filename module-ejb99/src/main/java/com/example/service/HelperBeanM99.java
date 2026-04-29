package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM99 {

    @EJB
    private HelperBeanL99 helperBeanL99;

    public String identify() {
        return "HelperBeanM99";
    }
}

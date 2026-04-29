package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL99 {

    @EJB
    private HelperBeanK99 helperBeanK99;

    public String identify() {
        return "HelperBeanL99";
    }
}

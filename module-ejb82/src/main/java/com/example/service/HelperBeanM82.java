package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM82 {

    @EJB
    private HelperBeanL82 helperBeanL82;

    public String identify() {
        return "HelperBeanM82";
    }
}

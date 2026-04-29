package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL42 {

    @EJB
    private HelperBeanK42 helperBeanK42;

    public String identify() {
        return "HelperBeanL42";
    }
}

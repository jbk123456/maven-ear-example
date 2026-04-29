package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM42 {

    @EJB
    private HelperBeanL42 helperBeanL42;

    public String identify() {
        return "HelperBeanM42";
    }
}

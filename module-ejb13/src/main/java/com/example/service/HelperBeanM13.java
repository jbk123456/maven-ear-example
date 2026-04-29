package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM13 {

    @EJB
    private HelperBeanL13 helperBeanL13;

    public String identify() {
        return "HelperBeanM13";
    }
}

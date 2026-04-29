package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM159 {

    @EJB
    private HelperBeanL159 helperBeanL159;

    public String identify() {
        return "HelperBeanM159";
    }
}

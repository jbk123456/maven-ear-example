package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM116 {

    @EJB
    private HelperBeanL116 helperBeanL116;

    public String identify() {
        return "HelperBeanM116";
    }
}

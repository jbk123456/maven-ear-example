package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM77 {

    @EJB
    private HelperBeanL77 helperBeanL77;

    public String identify() {
        return "HelperBeanM77";
    }
}

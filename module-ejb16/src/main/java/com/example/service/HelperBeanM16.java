package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM16 {

    @EJB
    private HelperBeanL16 helperBeanL16;

    public String identify() {
        return "HelperBeanM16";
    }
}

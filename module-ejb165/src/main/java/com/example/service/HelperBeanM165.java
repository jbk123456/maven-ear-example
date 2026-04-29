package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM165 {

    @EJB
    private HelperBeanL165 helperBeanL165;

    public String identify() {
        return "HelperBeanM165";
    }
}

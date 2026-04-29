package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL133 {

    @EJB
    private HelperBeanK133 helperBeanK133;

    public String identify() {
        return "HelperBeanL133";
    }
}

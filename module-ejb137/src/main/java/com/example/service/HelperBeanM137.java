package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM137 {

    @EJB
    private HelperBeanL137 helperBeanL137;

    public String identify() {
        return "HelperBeanM137";
    }
}

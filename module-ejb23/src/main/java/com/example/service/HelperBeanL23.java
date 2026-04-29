package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL23 {

    @EJB
    private HelperBeanK23 helperBeanK23;

    public String identify() {
        return "HelperBeanL23";
    }
}

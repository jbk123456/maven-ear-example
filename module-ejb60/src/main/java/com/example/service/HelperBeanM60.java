package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM60 {

    @EJB
    private HelperBeanL60 helperBeanL60;

    public String identify() {
        return "HelperBeanM60";
    }
}

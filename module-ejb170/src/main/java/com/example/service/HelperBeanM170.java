package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM170 {

    @EJB
    private HelperBeanL170 helperBeanL170;

    public String identify() {
        return "HelperBeanM170";
    }
}

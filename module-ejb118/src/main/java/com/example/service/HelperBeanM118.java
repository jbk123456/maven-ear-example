package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM118 {

    @EJB
    private HelperBeanL118 helperBeanL118;

    public String identify() {
        return "HelperBeanM118";
    }
}

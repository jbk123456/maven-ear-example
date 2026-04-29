package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM100 {

    @EJB
    private HelperBeanL100 helperBeanL100;

    public String identify() {
        return "HelperBeanM100";
    }
}

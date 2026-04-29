package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM145 {

    @EJB
    private HelperBeanL145 helperBeanL145;

    public String identify() {
        return "HelperBeanM145";
    }
}

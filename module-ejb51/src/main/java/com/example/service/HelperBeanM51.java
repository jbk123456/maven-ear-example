package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM51 {

    @EJB
    private HelperBeanL51 helperBeanL51;

    public String identify() {
        return "HelperBeanM51";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM157 {

    @EJB
    private HelperBeanL157 helperBeanL157;

    public String identify() {
        return "HelperBeanM157";
    }
}

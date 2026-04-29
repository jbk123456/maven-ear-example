package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM110 {

    @EJB
    private HelperBeanL110 helperBeanL110;

    public String identify() {
        return "HelperBeanM110";
    }
}

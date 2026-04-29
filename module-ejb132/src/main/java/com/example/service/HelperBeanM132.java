package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM132 {

    @EJB
    private HelperBeanL132 helperBeanL132;

    public String identify() {
        return "HelperBeanM132";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM38 {

    @EJB
    private HelperBeanL38 helperBeanL38;

    public String identify() {
        return "HelperBeanM38";
    }
}

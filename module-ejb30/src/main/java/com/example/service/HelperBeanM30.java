package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM30 {

    @EJB
    private HelperBeanL30 helperBeanL30;

    public String identify() {
        return "HelperBeanM30";
    }
}

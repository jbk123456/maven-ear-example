package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM48 {

    @EJB
    private HelperBeanL48 helperBeanL48;

    public String identify() {
        return "HelperBeanM48";
    }
}

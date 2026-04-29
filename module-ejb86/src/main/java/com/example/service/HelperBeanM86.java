package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM86 {

    @EJB
    private HelperBeanL86 helperBeanL86;

    public String identify() {
        return "HelperBeanM86";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM26 {

    @EJB
    private HelperBeanL26 helperBeanL26;

    public String identify() {
        return "HelperBeanM26";
    }
}

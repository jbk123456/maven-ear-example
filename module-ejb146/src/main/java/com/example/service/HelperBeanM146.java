package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM146 {

    @EJB
    private HelperBeanL146 helperBeanL146;

    public String identify() {
        return "HelperBeanM146";
    }
}

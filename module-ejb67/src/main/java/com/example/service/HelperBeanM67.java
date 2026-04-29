package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM67 {

    @EJB
    private HelperBeanL67 helperBeanL67;

    public String identify() {
        return "HelperBeanM67";
    }
}

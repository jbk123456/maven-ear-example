package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM17 {

    @EJB
    private HelperBeanL17 helperBeanL17;

    public String identify() {
        return "HelperBeanM17";
    }
}

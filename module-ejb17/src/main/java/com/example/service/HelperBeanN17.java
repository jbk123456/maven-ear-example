package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN17 {

    @EJB
    private HelperBeanM17 helperBeanM17;

    public String identify() {
        return "HelperBeanN17";
    }
}

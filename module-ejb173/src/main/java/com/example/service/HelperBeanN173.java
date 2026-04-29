package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN173 {

    @EJB
    private HelperBeanM173 helperBeanM173;

    public String identify() {
        return "HelperBeanN173";
    }
}

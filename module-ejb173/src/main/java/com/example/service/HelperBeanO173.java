package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO173 {

    @EJB
    private HelperBeanN173 helperBeanN173;

    public String identify() {
        return "HelperBeanO173";
    }
}

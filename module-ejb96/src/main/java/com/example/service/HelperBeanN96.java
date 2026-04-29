package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN96 {

    @EJB
    private HelperBeanM96 helperBeanM96;

    public String identify() {
        return "HelperBeanN96";
    }
}

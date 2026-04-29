package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM96 {

    @EJB
    private HelperBeanL96 helperBeanL96;

    public String identify() {
        return "HelperBeanM96";
    }
}

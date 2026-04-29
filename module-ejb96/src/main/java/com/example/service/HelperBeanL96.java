package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL96 {

    @EJB
    private HelperBeanK96 helperBeanK96;

    public String identify() {
        return "HelperBeanL96";
    }
}

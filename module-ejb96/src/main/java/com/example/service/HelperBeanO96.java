package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO96 {

    @EJB
    private HelperBeanN96 helperBeanN96;

    public String identify() {
        return "HelperBeanO96";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE96 {

    @EJB
    private HelperBeanD96 helperBeanD96;

    public String identify() {
        return "HelperBeanE96";
    }
}

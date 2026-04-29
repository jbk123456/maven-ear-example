package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK96 {

    @EJB
    private HelperBeanJ96 helperBeanJ96;

    public String identify() {
        return "HelperBeanK96";
    }
}

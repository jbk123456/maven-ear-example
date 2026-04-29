package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ96 {

    @EJB
    private HelperBeanI96 helperBeanI96;

    public String identify() {
        return "HelperBeanJ96";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI96 {

    @EJB
    private HelperBeanH96 helperBeanH96;

    public String identify() {
        return "HelperBeanI96";
    }
}

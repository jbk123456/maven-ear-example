package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH96 {

    @EJB
    private HelperBeanG96 helperBeanG96;

    public String identify() {
        return "HelperBeanH96";
    }
}

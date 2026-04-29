package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG96 {

    @EJB
    private HelperBeanF96 helperBeanF96;

    public String identify() {
        return "HelperBeanG96";
    }
}

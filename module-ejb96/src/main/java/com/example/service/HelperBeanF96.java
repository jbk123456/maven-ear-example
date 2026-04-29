package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF96 {

    @EJB
    private HelperBeanE96 helperBeanE96;

    public String identify() {
        return "HelperBeanF96";
    }
}

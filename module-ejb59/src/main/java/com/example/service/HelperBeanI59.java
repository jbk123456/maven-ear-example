package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI59 {

    @EJB
    private HelperBeanH59 helperBeanH59;

    public String identify() {
        return "HelperBeanI59";
    }
}

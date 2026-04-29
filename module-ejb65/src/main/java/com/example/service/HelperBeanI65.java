package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI65 {

    @EJB
    private HelperBeanH65 helperBeanH65;

    public String identify() {
        return "HelperBeanI65";
    }
}

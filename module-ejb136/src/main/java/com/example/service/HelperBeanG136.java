package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG136 {

    @EJB
    private HelperBeanF136 helperBeanF136;

    public String identify() {
        return "HelperBeanG136";
    }
}

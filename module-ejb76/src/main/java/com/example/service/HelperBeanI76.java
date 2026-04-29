package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI76 {

    @EJB
    private HelperBeanH76 helperBeanH76;

    public String identify() {
        return "HelperBeanI76";
    }
}

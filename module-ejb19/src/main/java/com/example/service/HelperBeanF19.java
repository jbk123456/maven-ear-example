package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF19 {

    @EJB
    private HelperBeanE19 helperBeanE19;

    public String identify() {
        return "HelperBeanF19";
    }
}

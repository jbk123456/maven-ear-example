package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE26 {

    @EJB
    private HelperBeanD26 helperBeanD26;

    public String identify() {
        return "HelperBeanE26";
    }
}

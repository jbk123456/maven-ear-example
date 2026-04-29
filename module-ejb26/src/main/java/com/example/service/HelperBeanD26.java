package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD26 {

    @EJB
    private HelperBeanC26 helperBeanC26;

    public String identify() {
        return "HelperBeanD26";
    }
}

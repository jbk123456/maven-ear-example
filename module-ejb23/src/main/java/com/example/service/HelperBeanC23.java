package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC23 {

    @EJB
    private HelperBeanB23 helperBeanB23;

    public String identify() {
        return "HelperBeanC23";
    }
}

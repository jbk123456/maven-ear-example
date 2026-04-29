package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC124 {

    @EJB
    private HelperBeanB124 helperBeanB124;

    public String identify() {
        return "HelperBeanC124";
    }
}

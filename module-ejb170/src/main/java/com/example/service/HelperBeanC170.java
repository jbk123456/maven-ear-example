package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC170 {

    @EJB
    private HelperBeanB170 helperBeanB170;

    public String identify() {
        return "HelperBeanC170";
    }
}

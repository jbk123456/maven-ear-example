package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC133 {

    @EJB
    private HelperBeanB133 helperBeanB133;

    public String identify() {
        return "HelperBeanC133";
    }
}

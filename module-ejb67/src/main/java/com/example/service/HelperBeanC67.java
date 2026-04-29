package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC67 {

    @EJB
    private HelperBeanB67 helperBeanB67;

    public String identify() {
        return "HelperBeanC67";
    }
}

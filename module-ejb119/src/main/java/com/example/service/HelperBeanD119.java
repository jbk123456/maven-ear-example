package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD119 {

    @EJB
    private HelperBeanC119 helperBeanC119;

    public String identify() {
        return "HelperBeanD119";
    }
}

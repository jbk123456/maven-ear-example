package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD44 {

    @EJB
    private HelperBeanC44 helperBeanC44;

    public String identify() {
        return "HelperBeanD44";
    }
}

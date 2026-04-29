package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD33 {

    @EJB
    private HelperBeanC33 helperBeanC33;

    public String identify() {
        return "HelperBeanD33";
    }
}

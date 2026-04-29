package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD54 {

    @EJB
    private HelperBeanC54 helperBeanC54;

    public String identify() {
        return "HelperBeanD54";
    }
}

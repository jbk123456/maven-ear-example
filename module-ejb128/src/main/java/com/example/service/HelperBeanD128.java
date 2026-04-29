package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD128 {

    @EJB
    private HelperBeanC128 helperBeanC128;

    public String identify() {
        return "HelperBeanD128";
    }
}

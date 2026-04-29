package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD88 {

    @EJB
    private HelperBeanC88 helperBeanC88;

    public String identify() {
        return "HelperBeanD88";
    }
}

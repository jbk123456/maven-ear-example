package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD136 {

    @EJB
    private HelperBeanC136 helperBeanC136;

    public String identify() {
        return "HelperBeanD136";
    }
}

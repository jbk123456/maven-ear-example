package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD74 {

    @EJB
    private HelperBeanC74 helperBeanC74;

    public String identify() {
        return "HelperBeanD74";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD82 {

    @EJB
    private HelperBeanC82 helperBeanC82;

    public String identify() {
        return "HelperBeanD82";
    }
}

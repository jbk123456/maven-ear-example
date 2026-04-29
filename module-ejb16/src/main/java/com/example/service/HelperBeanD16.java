package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD16 {

    @EJB
    private HelperBeanC16 helperBeanC16;

    public String identify() {
        return "HelperBeanD16";
    }
}

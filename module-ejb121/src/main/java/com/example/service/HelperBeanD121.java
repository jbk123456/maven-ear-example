package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD121 {

    @EJB
    private HelperBeanC121 helperBeanC121;

    public String identify() {
        return "HelperBeanD121";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD161 {

    @EJB
    private HelperBeanC161 helperBeanC161;

    public String identify() {
        return "HelperBeanD161";
    }
}

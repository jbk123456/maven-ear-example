package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD135 {

    @EJB
    private HelperBeanC135 helperBeanC135;

    public String identify() {
        return "HelperBeanD135";
    }
}

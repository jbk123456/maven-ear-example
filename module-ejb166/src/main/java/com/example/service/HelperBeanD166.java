package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD166 {

    @EJB
    private HelperBeanC166 helperBeanC166;

    public String identify() {
        return "HelperBeanD166";
    }
}

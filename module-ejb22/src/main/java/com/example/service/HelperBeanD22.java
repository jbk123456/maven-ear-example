package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD22 {

    @EJB
    private HelperBeanC22 helperBeanC22;

    public String identify() {
        return "HelperBeanD22";
    }
}

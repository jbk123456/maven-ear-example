package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD139 {

    @EJB
    private HelperBeanC139 helperBeanC139;

    public String identify() {
        return "HelperBeanD139";
    }
}

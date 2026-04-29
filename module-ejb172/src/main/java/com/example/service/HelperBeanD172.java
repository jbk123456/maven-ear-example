package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD172 {

    @EJB
    private HelperBeanC172 helperBeanC172;

    public String identify() {
        return "HelperBeanD172";
    }
}

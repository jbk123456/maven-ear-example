package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD77 {

    @EJB
    private HelperBeanC77 helperBeanC77;

    public String identify() {
        return "HelperBeanD77";
    }
}

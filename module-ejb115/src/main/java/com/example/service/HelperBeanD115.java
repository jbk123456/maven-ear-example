package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD115 {

    @EJB
    private HelperBeanC115 helperBeanC115;

    public String identify() {
        return "HelperBeanD115";
    }
}

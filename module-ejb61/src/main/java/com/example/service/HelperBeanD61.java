package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD61 {

    @EJB
    private HelperBeanC61 helperBeanC61;

    public String identify() {
        return "HelperBeanD61";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD171 {

    @EJB
    private HelperBeanC171 helperBeanC171;

    public String identify() {
        return "HelperBeanD171";
    }
}

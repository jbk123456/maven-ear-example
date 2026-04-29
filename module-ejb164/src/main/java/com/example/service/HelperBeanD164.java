package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD164 {

    @EJB
    private HelperBeanC164 helperBeanC164;

    public String identify() {
        return "HelperBeanD164";
    }
}

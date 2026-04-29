package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD151 {

    @EJB
    private HelperBeanC151 helperBeanC151;

    public String identify() {
        return "HelperBeanD151";
    }
}

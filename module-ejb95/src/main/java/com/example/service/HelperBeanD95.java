package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD95 {

    @EJB
    private HelperBeanC95 helperBeanC95;

    public String identify() {
        return "HelperBeanD95";
    }
}

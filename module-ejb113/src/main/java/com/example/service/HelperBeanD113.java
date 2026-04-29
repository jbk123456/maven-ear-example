package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD113 {

    @EJB
    private HelperBeanC113 helperBeanC113;

    public String identify() {
        return "HelperBeanD113";
    }
}

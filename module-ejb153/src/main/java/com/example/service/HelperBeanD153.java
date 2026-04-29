package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD153 {

    @EJB
    private HelperBeanC153 helperBeanC153;

    public String identify() {
        return "HelperBeanD153";
    }
}

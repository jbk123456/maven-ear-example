package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD52 {

    @EJB
    private HelperBeanC52 helperBeanC52;

    public String identify() {
        return "HelperBeanD52";
    }
}

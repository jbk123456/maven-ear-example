package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD40 {

    @EJB
    private HelperBeanC40 helperBeanC40;

    public String identify() {
        return "HelperBeanD40";
    }
}

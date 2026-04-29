package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD59 {

    @EJB
    private HelperBeanC59 helperBeanC59;

    public String identify() {
        return "HelperBeanD59";
    }
}

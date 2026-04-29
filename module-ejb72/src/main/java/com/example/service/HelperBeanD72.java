package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD72 {

    @EJB
    private HelperBeanC72 helperBeanC72;

    public String identify() {
        return "HelperBeanD72";
    }
}

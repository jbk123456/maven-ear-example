package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK86 {

    @EJB
    private HelperBeanJ86 helperBeanJ86;

    public String identify() {
        return "HelperBeanK86";
    }
}

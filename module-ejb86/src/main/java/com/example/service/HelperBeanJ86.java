package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ86 {

    @EJB
    private HelperBeanI86 helperBeanI86;

    public String identify() {
        return "HelperBeanJ86";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC64 {

    @EJB
    private HelperBeanB64 helperBeanB64;

    public String identify() {
        return "HelperBeanC64";
    }
}

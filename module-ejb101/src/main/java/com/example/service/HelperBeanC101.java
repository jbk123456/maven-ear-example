package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC101 {

    @EJB
    private HelperBeanB101 helperBeanB101;

    public String identify() {
        return "HelperBeanC101";
    }
}

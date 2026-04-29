package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC44 {

    @EJB
    private HelperBeanB44 helperBeanB44;

    public String identify() {
        return "HelperBeanC44";
    }
}

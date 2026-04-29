package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC106 {

    @EJB
    private HelperBeanB106 helperBeanB106;

    public String identify() {
        return "HelperBeanC106";
    }
}

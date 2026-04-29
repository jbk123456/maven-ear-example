package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC137 {

    @EJB
    private HelperBeanB137 helperBeanB137;

    public String identify() {
        return "HelperBeanC137";
    }
}

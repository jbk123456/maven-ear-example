package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC113 {

    @EJB
    private HelperBeanB113 helperBeanB113;

    public String identify() {
        return "HelperBeanC113";
    }
}

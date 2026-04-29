package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC104 {

    @EJB
    private HelperBeanB104 helperBeanB104;

    public String identify() {
        return "HelperBeanC104";
    }
}

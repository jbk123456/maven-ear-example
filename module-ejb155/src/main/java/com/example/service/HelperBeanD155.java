package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD155 {

    @EJB
    private HelperBeanC155 helperBeanC155;

    public String identify() {
        return "HelperBeanD155";
    }
}

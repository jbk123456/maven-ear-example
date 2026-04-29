package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD107 {

    @EJB
    private HelperBeanC107 helperBeanC107;

    public String identify() {
        return "HelperBeanD107";
    }
}

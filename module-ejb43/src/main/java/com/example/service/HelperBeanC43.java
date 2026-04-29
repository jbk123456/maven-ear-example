package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC43 {

    @EJB
    private HelperBeanB43 helperBeanB43;

    public String identify() {
        return "HelperBeanC43";
    }
}

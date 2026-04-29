package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD69 {

    @EJB
    private HelperBeanC69 helperBeanC69;

    public String identify() {
        return "HelperBeanD69";
    }
}

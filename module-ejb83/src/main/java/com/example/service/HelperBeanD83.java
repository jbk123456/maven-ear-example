package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD83 {

    @EJB
    private HelperBeanC83 helperBeanC83;

    public String identify() {
        return "HelperBeanD83";
    }
}

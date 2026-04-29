package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC7 {

    @EJB
    private HelperBeanB7 helperBeanB7;

    public String identify() {
        return "HelperBeanC7";
    }
}

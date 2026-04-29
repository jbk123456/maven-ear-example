package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD159 {

    @EJB
    private HelperBeanC159 helperBeanC159;

    public String identify() {
        return "HelperBeanD159";
    }
}

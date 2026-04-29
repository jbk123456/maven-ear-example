package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE159 {

    @EJB
    private HelperBeanD159 helperBeanD159;

    public String identify() {
        return "HelperBeanE159";
    }
}

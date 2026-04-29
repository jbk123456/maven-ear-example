package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF159 {

    @EJB
    private HelperBeanE159 helperBeanE159;

    public String identify() {
        return "HelperBeanF159";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG159 {

    @EJB
    private HelperBeanF159 helperBeanF159;

    public String identify() {
        return "HelperBeanG159";
    }
}

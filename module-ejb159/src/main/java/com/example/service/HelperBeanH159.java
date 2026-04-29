package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH159 {

    @EJB
    private HelperBeanG159 helperBeanG159;

    public String identify() {
        return "HelperBeanH159";
    }
}

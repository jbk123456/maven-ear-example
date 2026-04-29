package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG101 {

    @EJB
    private HelperBeanF101 helperBeanF101;

    public String identify() {
        return "HelperBeanG101";
    }
}

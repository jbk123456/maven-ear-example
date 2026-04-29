package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH101 {

    @EJB
    private HelperBeanG101 helperBeanG101;

    public String identify() {
        return "HelperBeanH101";
    }
}

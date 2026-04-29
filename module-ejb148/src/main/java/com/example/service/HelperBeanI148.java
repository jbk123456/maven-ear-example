package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI148 {

    @EJB
    private HelperBeanH148 helperBeanH148;

    public String identify() {
        return "HelperBeanI148";
    }
}

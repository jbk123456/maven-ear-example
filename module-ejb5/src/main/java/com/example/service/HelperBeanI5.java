package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI5 {

    @EJB
    private HelperBeanH5 helperBeanH5;

    public String identify() {
        return "HelperBeanI5";
    }
}

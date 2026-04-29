package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ5 {

    @EJB
    private HelperBeanI5 helperBeanI5;

    public String identify() {
        return "HelperBeanJ5";
    }
}

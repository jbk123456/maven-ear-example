package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ17 {

    @EJB
    private HelperBeanI17 helperBeanI17;

    public String identify() {
        return "HelperBeanJ17";
    }
}

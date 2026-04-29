package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ1 {

    @EJB
    private HelperBeanI1 helperBeanI1;

    public String identify() {
        return "HelperBeanJ1";
    }
}

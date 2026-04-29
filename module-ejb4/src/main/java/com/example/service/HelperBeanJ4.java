package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ4 {

    @EJB
    private HelperBeanI4 helperBeanI4;

    public String identify() {
        return "HelperBeanJ4";
    }
}

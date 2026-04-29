package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ67 {

    @EJB
    private HelperBeanI67 helperBeanI67;

    public String identify() {
        return "HelperBeanJ67";
    }
}

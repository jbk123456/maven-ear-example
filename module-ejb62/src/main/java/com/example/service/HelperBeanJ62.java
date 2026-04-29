package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ62 {

    @EJB
    private HelperBeanI62 helperBeanI62;

    public String identify() {
        return "HelperBeanJ62";
    }
}

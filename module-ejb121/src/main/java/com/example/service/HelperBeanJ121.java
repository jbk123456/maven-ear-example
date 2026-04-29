package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ121 {

    @EJB
    private HelperBeanI121 helperBeanI121;

    public String identify() {
        return "HelperBeanJ121";
    }
}

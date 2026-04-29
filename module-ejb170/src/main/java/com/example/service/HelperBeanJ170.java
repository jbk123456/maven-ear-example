package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ170 {

    @EJB
    private HelperBeanI170 helperBeanI170;

    public String identify() {
        return "HelperBeanJ170";
    }
}

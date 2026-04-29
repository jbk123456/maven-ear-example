package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI122 {

    @EJB
    private HelperBeanH122 helperBeanH122;

    public String identify() {
        return "HelperBeanI122";
    }
}

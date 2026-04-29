package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ10 {

    @EJB
    private HelperBeanI10 helperBeanI10;

    public String identify() {
        return "HelperBeanJ10";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ157 {

    @EJB
    private HelperBeanI157 helperBeanI157;

    public String identify() {
        return "HelperBeanJ157";
    }
}

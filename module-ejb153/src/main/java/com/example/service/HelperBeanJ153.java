package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ153 {

    @EJB
    private HelperBeanI153 helperBeanI153;

    public String identify() {
        return "HelperBeanJ153";
    }
}

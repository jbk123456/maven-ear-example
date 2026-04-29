package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI153 {

    @EJB
    private HelperBeanH153 helperBeanH153;

    public String identify() {
        return "HelperBeanI153";
    }
}

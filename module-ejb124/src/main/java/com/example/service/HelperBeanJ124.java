package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ124 {

    @EJB
    private HelperBeanI124 helperBeanI124;

    public String identify() {
        return "HelperBeanJ124";
    }
}

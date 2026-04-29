package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ30 {

    @EJB
    private HelperBeanI30 helperBeanI30;

    public String identify() {
        return "HelperBeanJ30";
    }
}

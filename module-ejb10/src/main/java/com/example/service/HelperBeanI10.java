package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI10 {

    @EJB
    private HelperBeanH10 helperBeanH10;

    public String identify() {
        return "HelperBeanI10";
    }
}

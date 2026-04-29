package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI142 {

    @EJB
    private HelperBeanH142 helperBeanH142;

    public String identify() {
        return "HelperBeanI142";
    }
}

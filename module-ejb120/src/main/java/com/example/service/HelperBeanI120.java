package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI120 {

    @EJB
    private HelperBeanH120 helperBeanH120;

    public String identify() {
        return "HelperBeanI120";
    }
}

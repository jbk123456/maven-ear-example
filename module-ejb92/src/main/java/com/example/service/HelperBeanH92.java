package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH92 {

    @EJB
    private HelperBeanG92 helperBeanG92;

    public String identify() {
        return "HelperBeanH92";
    }
}

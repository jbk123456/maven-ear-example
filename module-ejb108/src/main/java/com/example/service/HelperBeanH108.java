package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH108 {

    @EJB
    private HelperBeanG108 helperBeanG108;

    public String identify() {
        return "HelperBeanH108";
    }
}

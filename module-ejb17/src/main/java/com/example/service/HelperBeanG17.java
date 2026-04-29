package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG17 {

    @EJB
    private HelperBeanF17 helperBeanF17;

    public String identify() {
        return "HelperBeanG17";
    }
}

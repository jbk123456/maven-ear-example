package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH9 {

    @EJB
    private HelperBeanG9 helperBeanG9;

    public String identify() {
        return "HelperBeanH9";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG9 {

    @EJB
    private HelperBeanF9 helperBeanF9;

    public String identify() {
        return "HelperBeanG9";
    }
}

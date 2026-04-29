package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG54 {

    @EJB
    private HelperBeanF54 helperBeanF54;

    public String identify() {
        return "HelperBeanG54";
    }
}

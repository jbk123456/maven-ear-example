package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG93 {

    @EJB
    private HelperBeanF93 helperBeanF93;

    public String identify() {
        return "HelperBeanG93";
    }
}

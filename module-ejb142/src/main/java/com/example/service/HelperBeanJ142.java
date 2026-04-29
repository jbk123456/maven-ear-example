package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ142 {

    @EJB
    private HelperBeanI142 helperBeanI142;

    public String identify() {
        return "HelperBeanJ142";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF38 {

    @EJB
    private HelperBeanE38 helperBeanE38;

    public String identify() {
        return "HelperBeanF38";
    }
}

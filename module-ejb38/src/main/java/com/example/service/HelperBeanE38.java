package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE38 {

    @EJB
    private HelperBeanD38 helperBeanD38;

    public String identify() {
        return "HelperBeanE38";
    }
}

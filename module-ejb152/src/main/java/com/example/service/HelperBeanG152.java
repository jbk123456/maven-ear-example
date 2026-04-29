package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG152 {

    @EJB
    private HelperBeanF152 helperBeanF152;

    public String identify() {
        return "HelperBeanG152";
    }
}

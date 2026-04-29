package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG171 {

    @EJB
    private HelperBeanF171 helperBeanF171;

    public String identify() {
        return "HelperBeanG171";
    }
}

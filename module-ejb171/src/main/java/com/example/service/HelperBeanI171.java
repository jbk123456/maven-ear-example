package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI171 {

    @EJB
    private HelperBeanH171 helperBeanH171;

    public String identify() {
        return "HelperBeanI171";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI6 {

    @EJB
    private HelperBeanH6 helperBeanH6;

    public String identify() {
        return "HelperBeanI6";
    }
}

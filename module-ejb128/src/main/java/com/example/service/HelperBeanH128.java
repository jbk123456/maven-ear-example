package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH128 {

    @EJB
    private HelperBeanG128 helperBeanG128;

    public String identify() {
        return "HelperBeanH128";
    }
}

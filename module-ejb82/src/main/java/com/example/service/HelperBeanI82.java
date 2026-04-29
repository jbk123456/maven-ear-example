package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI82 {

    @EJB
    private HelperBeanH82 helperBeanH82;

    public String identify() {
        return "HelperBeanI82";
    }
}

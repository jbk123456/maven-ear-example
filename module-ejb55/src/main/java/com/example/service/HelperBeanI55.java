package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI55 {

    @EJB
    private HelperBeanH55 helperBeanH55;

    public String identify() {
        return "HelperBeanI55";
    }
}

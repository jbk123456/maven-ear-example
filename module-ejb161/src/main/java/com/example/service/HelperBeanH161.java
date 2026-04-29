package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH161 {

    @EJB
    private HelperBeanG161 helperBeanG161;

    public String identify() {
        return "HelperBeanH161";
    }
}

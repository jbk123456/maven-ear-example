package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB138 {

    @EJB
    private HelperBeanA138 helperBeanA138;

    public String identify() {
        return "HelperBeanB138";
    }
}

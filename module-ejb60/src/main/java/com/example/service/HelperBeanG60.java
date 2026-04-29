package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG60 {

    @EJB
    private HelperBeanF60 helperBeanF60;

    public String identify() {
        return "HelperBeanG60";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB116 {

    @EJB
    private HelperBeanA116 helperBeanA116;

    public String identify() {
        return "HelperBeanB116";
    }
}

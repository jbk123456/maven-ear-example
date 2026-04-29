package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB81 {

    @EJB
    private HelperBeanA81 helperBeanA81;

    public String identify() {
        return "HelperBeanB81";
    }
}

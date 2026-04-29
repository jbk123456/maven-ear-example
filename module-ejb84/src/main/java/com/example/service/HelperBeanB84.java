package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB84 {

    @EJB
    private HelperBeanA84 helperBeanA84;

    public String identify() {
        return "HelperBeanB84";
    }
}

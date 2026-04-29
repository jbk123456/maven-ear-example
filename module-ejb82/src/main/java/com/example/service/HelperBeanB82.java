package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB82 {

    @EJB
    private HelperBeanA82 helperBeanA82;

    public String identify() {
        return "HelperBeanB82";
    }
}

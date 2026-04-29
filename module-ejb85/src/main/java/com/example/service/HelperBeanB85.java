package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB85 {

    @EJB
    private HelperBeanA85 helperBeanA85;

    public String identify() {
        return "HelperBeanB85";
    }
}

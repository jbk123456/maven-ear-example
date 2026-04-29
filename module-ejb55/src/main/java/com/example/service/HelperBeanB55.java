package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB55 {

    @EJB
    private HelperBeanA55 helperBeanA55;

    public String identify() {
        return "HelperBeanB55";
    }
}

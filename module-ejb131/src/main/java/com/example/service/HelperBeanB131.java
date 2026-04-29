package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB131 {

    @EJB
    private HelperBeanA131 helperBeanA131;

    public String identify() {
        return "HelperBeanB131";
    }
}

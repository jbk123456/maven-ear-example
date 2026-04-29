package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB150 {

    @EJB
    private HelperBeanA150 helperBeanA150;

    public String identify() {
        return "HelperBeanB150";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB59 {

    @EJB
    private HelperBeanA59 helperBeanA59;

    public String identify() {
        return "HelperBeanB59";
    }
}

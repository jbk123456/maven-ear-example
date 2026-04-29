package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB70 {

    @EJB
    private HelperBeanA70 helperBeanA70;

    public String identify() {
        return "HelperBeanB70";
    }
}

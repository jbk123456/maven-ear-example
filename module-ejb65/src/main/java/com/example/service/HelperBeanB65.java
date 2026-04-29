package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB65 {

    @EJB
    private HelperBeanA65 helperBeanA65;

    public String identify() {
        return "HelperBeanB65";
    }
}

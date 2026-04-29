package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB121 {

    @EJB
    private HelperBeanA121 helperBeanA121;

    public String identify() {
        return "HelperBeanB121";
    }
}

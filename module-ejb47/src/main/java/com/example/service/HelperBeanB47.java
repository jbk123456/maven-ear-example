package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB47 {

    @EJB
    private HelperBeanA47 helperBeanA47;

    public String identify() {
        return "HelperBeanB47";
    }
}

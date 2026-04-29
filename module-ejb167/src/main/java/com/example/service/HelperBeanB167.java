package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB167 {

    @EJB
    private HelperBeanA167 helperBeanA167;

    public String identify() {
        return "HelperBeanB167";
    }
}

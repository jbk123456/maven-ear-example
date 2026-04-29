package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB166 {

    @EJB
    private HelperBeanA166 helperBeanA166;

    public String identify() {
        return "HelperBeanB166";
    }
}

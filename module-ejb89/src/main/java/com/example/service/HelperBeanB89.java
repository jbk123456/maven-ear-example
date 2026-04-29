package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB89 {

    @EJB
    private HelperBeanA89 helperBeanA89;

    public String identify() {
        return "HelperBeanB89";
    }
}

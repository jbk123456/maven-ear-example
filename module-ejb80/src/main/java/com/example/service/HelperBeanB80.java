package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB80 {

    @EJB
    private HelperBeanA80 helperBeanA80;

    public String identify() {
        return "HelperBeanB80";
    }
}

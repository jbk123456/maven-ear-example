package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB97 {

    @EJB
    private HelperBeanA97 helperBeanA97;

    public String identify() {
        return "HelperBeanB97";
    }
}

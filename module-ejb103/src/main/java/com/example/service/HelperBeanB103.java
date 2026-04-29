package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB103 {

    @EJB
    private HelperBeanA103 helperBeanA103;

    public String identify() {
        return "HelperBeanB103";
    }
}

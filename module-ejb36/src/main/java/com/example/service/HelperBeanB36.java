package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB36 {

    @EJB
    private HelperBeanA36 helperBeanA36;

    public String identify() {
        return "HelperBeanB36";
    }
}

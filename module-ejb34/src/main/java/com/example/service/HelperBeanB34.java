package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB34 {

    @EJB
    private HelperBeanA34 helperBeanA34;

    public String identify() {
        return "HelperBeanB34";
    }
}

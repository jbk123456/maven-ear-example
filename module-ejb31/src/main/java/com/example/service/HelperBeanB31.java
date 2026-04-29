package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB31 {

    @EJB
    private HelperBeanA31 helperBeanA31;

    public String identify() {
        return "HelperBeanB31";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB21 {

    @EJB
    private HelperBeanA21 helperBeanA21;

    public String identify() {
        return "HelperBeanB21";
    }
}

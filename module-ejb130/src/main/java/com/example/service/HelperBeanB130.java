package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB130 {

    @EJB
    private HelperBeanA130 helperBeanA130;

    public String identify() {
        return "HelperBeanB130";
    }
}

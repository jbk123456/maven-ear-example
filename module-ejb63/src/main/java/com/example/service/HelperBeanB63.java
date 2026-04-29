package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB63 {

    @EJB
    private HelperBeanA63 helperBeanA63;

    public String identify() {
        return "HelperBeanB63";
    }
}

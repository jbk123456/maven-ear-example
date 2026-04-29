package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB125 {

    @EJB
    private HelperBeanA125 helperBeanA125;

    public String identify() {
        return "HelperBeanB125";
    }
}

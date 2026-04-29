package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE72 {

    @EJB
    private HelperBeanD72 helperBeanD72;

    public String identify() {
        return "HelperBeanE72";
    }
}

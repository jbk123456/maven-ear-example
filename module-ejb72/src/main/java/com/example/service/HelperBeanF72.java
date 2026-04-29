package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF72 {

    @EJB
    private HelperBeanE72 helperBeanE72;

    public String identify() {
        return "HelperBeanF72";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI157 {

    @EJB
    private HelperBeanH157 helperBeanH157;

    public String identify() {
        return "HelperBeanI157";
    }
}

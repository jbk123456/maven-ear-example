package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG85 {

    @EJB
    private HelperBeanF85 helperBeanF85;

    public String identify() {
        return "HelperBeanG85";
    }
}

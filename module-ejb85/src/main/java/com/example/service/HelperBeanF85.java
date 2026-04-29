package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF85 {

    @EJB
    private HelperBeanE85 helperBeanE85;

    public String identify() {
        return "HelperBeanF85";
    }
}

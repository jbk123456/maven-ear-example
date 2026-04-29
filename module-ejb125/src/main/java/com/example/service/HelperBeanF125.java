package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF125 {

    @EJB
    private HelperBeanE125 helperBeanE125;

    public String identify() {
        return "HelperBeanF125";
    }
}

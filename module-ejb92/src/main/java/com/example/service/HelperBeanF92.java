package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF92 {

    @EJB
    private HelperBeanE92 helperBeanE92;

    public String identify() {
        return "HelperBeanF92";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF40 {

    @EJB
    private HelperBeanE40 helperBeanE40;

    public String identify() {
        return "HelperBeanF40";
    }
}

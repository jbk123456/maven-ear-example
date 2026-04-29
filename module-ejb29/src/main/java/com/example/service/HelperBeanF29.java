package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF29 {

    @EJB
    private HelperBeanE29 helperBeanE29;

    public String identify() {
        return "HelperBeanF29";
    }
}

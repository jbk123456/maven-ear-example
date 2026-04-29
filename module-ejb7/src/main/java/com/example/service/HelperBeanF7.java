package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF7 {

    @EJB
    private HelperBeanE7 helperBeanE7;

    public String identify() {
        return "HelperBeanF7";
    }
}

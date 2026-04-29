package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF9 {

    @EJB
    private HelperBeanE9 helperBeanE9;

    public String identify() {
        return "HelperBeanF9";
    }
}

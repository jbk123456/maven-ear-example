package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF83 {

    @EJB
    private HelperBeanE83 helperBeanE83;

    public String identify() {
        return "HelperBeanF83";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI167 {

    @EJB
    private HelperBeanH167 helperBeanH167;

    public String identify() {
        return "HelperBeanI167";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG28 {

    @EJB
    private HelperBeanF28 helperBeanF28;

    public String identify() {
        return "HelperBeanG28";
    }
}

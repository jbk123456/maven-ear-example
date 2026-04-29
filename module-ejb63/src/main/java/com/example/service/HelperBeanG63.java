package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG63 {

    @EJB
    private HelperBeanF63 helperBeanF63;

    public String identify() {
        return "HelperBeanG63";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF53 {

    @EJB
    private HelperBeanE53 helperBeanE53;

    public String identify() {
        return "HelperBeanF53";
    }
}

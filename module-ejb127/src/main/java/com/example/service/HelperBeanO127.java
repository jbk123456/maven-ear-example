package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO127 {

    @EJB
    private HelperBeanN127 helperBeanN127;

    public String identify() {
        return "HelperBeanO127";
    }
}

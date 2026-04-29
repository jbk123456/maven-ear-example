package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK100 {

    @EJB
    private HelperBeanJ100 helperBeanJ100;

    public String identify() {
        return "HelperBeanK100";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK98 {

    @EJB
    private HelperBeanJ98 helperBeanJ98;

    public String identify() {
        return "HelperBeanK98";
    }
}

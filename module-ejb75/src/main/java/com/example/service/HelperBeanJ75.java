package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ75 {

    @EJB
    private HelperBeanI75 helperBeanI75;

    public String identify() {
        return "HelperBeanJ75";
    }
}

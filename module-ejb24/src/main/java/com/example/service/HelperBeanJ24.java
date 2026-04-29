package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ24 {

    @EJB
    private HelperBeanI24 helperBeanI24;

    public String identify() {
        return "HelperBeanJ24";
    }
}

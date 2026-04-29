package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK53 {

    @EJB
    private HelperBeanJ53 helperBeanJ53;

    public String identify() {
        return "HelperBeanK53";
    }
}

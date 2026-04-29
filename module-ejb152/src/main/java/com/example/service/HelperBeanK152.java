package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK152 {

    @EJB
    private HelperBeanJ152 helperBeanJ152;

    public String identify() {
        return "HelperBeanK152";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK173 {

    @EJB
    private HelperBeanJ173 helperBeanJ173;

    public String identify() {
        return "HelperBeanK173";
    }
}

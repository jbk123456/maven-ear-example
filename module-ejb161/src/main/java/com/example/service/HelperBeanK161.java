package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK161 {

    @EJB
    private HelperBeanJ161 helperBeanJ161;

    public String identify() {
        return "HelperBeanK161";
    }
}

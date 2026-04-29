package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ161 {

    @EJB
    private HelperBeanI161 helperBeanI161;

    public String identify() {
        return "HelperBeanJ161";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK80 {

    @EJB
    private HelperBeanJ80 helperBeanJ80;

    public String identify() {
        return "HelperBeanK80";
    }
}

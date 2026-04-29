package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ54 {

    @EJB
    private HelperBeanI54 helperBeanI54;

    public String identify() {
        return "HelperBeanJ54";
    }
}

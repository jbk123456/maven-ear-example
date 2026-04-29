package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK26 {

    @EJB
    private HelperBeanJ26 helperBeanJ26;

    public String identify() {
        return "HelperBeanK26";
    }
}

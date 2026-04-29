package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ48 {

    @EJB
    private HelperBeanI48 helperBeanI48;

    public String identify() {
        return "HelperBeanJ48";
    }
}

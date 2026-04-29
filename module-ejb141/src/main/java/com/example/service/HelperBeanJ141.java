package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ141 {

    @EJB
    private HelperBeanI141 helperBeanI141;

    public String identify() {
        return "HelperBeanJ141";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ149 {

    @EJB
    private HelperBeanI149 helperBeanI149;

    public String identify() {
        return "HelperBeanJ149";
    }
}

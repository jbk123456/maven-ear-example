package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK119 {

    @EJB
    private HelperBeanJ119 helperBeanJ119;

    public String identify() {
        return "HelperBeanK119";
    }
}

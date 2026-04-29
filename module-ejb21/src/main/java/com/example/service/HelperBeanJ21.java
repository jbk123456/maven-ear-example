package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ21 {

    @EJB
    private HelperBeanI21 helperBeanI21;

    public String identify() {
        return "HelperBeanJ21";
    }
}

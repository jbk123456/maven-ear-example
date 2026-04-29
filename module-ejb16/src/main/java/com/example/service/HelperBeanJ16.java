package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ16 {

    @EJB
    private HelperBeanI16 helperBeanI16;

    public String identify() {
        return "HelperBeanJ16";
    }
}

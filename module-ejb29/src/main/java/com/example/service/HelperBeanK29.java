package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK29 {

    @EJB
    private HelperBeanJ29 helperBeanJ29;

    public String identify() {
        return "HelperBeanK29";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK126 {

    @EJB
    private HelperBeanJ126 helperBeanJ126;

    public String identify() {
        return "HelperBeanK126";
    }
}

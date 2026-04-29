package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK1 {

    @EJB
    private HelperBeanJ1 helperBeanJ1;

    public String identify() {
        return "HelperBeanK1";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK111 {

    @EJB
    private HelperBeanJ111 helperBeanJ111;

    public String identify() {
        return "HelperBeanK111";
    }
}

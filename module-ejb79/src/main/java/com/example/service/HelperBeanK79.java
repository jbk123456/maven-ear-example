package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK79 {

    @EJB
    private HelperBeanJ79 helperBeanJ79;

    public String identify() {
        return "HelperBeanK79";
    }
}

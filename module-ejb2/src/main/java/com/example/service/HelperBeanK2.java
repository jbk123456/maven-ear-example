package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK2 {

    @EJB
    private HelperBeanJ2 helperBeanJ2;

    public String identify() {
        return "HelperBeanK2";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK124 {

    @EJB
    private HelperBeanJ124 helperBeanJ124;

    public String identify() {
        return "HelperBeanK124";
    }
}

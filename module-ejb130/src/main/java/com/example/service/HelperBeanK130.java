package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK130 {

    @EJB
    private HelperBeanJ130 helperBeanJ130;

    public String identify() {
        return "HelperBeanK130";
    }
}

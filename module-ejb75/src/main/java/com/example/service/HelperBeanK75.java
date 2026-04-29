package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK75 {

    @EJB
    private HelperBeanJ75 helperBeanJ75;

    public String identify() {
        return "HelperBeanK75";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK82 {

    @EJB
    private HelperBeanJ82 helperBeanJ82;

    public String identify() {
        return "HelperBeanK82";
    }
}

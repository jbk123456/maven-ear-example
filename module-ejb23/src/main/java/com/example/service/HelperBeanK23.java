package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK23 {

    @EJB
    private HelperBeanJ23 helperBeanJ23;

    public String identify() {
        return "HelperBeanK23";
    }
}

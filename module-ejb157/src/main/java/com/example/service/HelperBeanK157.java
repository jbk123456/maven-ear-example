package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK157 {

    @EJB
    private HelperBeanJ157 helperBeanJ157;

    public String identify() {
        return "HelperBeanK157";
    }
}

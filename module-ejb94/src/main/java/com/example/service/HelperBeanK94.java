package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK94 {

    @EJB
    private HelperBeanJ94 helperBeanJ94;

    public String identify() {
        return "HelperBeanK94";
    }
}

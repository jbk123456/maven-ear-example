package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK47 {

    @EJB
    private HelperBeanJ47 helperBeanJ47;

    public String identify() {
        return "HelperBeanK47";
    }
}

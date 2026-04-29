package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ47 {

    @EJB
    private HelperBeanI47 helperBeanI47;

    public String identify() {
        return "HelperBeanJ47";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK120 {

    @EJB
    private HelperBeanJ120 helperBeanJ120;

    public String identify() {
        return "HelperBeanK120";
    }
}

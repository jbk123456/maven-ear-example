package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK54 {

    @EJB
    private HelperBeanJ54 helperBeanJ54;

    public String identify() {
        return "HelperBeanK54";
    }
}

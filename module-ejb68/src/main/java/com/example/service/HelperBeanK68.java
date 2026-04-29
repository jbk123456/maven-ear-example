package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK68 {

    @EJB
    private HelperBeanJ68 helperBeanJ68;

    public String identify() {
        return "HelperBeanK68";
    }
}

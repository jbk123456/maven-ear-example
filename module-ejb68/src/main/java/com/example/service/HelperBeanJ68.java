package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ68 {

    @EJB
    private HelperBeanI68 helperBeanI68;

    public String identify() {
        return "HelperBeanJ68";
    }
}

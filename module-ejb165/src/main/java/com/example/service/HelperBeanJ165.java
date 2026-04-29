package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ165 {

    @EJB
    private HelperBeanI165 helperBeanI165;

    public String identify() {
        return "HelperBeanJ165";
    }
}

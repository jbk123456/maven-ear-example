package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK55 {

    @EJB
    private HelperBeanJ55 helperBeanJ55;

    public String identify() {
        return "HelperBeanK55";
    }
}

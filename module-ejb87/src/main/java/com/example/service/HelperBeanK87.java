package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK87 {

    @EJB
    private HelperBeanJ87 helperBeanJ87;

    public String identify() {
        return "HelperBeanK87";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK48 {

    @EJB
    private HelperBeanJ48 helperBeanJ48;

    public String identify() {
        return "HelperBeanK48";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK17 {

    @EJB
    private HelperBeanJ17 helperBeanJ17;

    public String identify() {
        return "HelperBeanK17";
    }
}

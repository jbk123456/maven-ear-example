package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK159 {

    @EJB
    private HelperBeanJ159 helperBeanJ159;

    public String identify() {
        return "HelperBeanK159";
    }
}

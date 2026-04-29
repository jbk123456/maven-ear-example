package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK52 {

    @EJB
    private HelperBeanJ52 helperBeanJ52;

    public String identify() {
        return "HelperBeanK52";
    }
}

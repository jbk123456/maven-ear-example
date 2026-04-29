package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK5 {

    @EJB
    private HelperBeanJ5 helperBeanJ5;

    public String identify() {
        return "HelperBeanK5";
    }
}

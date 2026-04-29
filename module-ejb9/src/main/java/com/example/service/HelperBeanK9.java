package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK9 {

    @EJB
    private HelperBeanJ9 helperBeanJ9;

    public String identify() {
        return "HelperBeanK9";
    }
}

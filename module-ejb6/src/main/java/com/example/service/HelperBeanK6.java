package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK6 {

    @EJB
    private HelperBeanJ6 helperBeanJ6;

    public String identify() {
        return "HelperBeanK6";
    }
}

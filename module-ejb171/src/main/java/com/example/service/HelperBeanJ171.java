package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ171 {

    @EJB
    private HelperBeanI171 helperBeanI171;

    public String identify() {
        return "HelperBeanJ171";
    }
}

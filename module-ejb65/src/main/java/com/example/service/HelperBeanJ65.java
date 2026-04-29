package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ65 {

    @EJB
    private HelperBeanI65 helperBeanI65;

    public String identify() {
        return "HelperBeanJ65";
    }
}

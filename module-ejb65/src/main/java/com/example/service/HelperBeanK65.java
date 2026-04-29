package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK65 {

    @EJB
    private HelperBeanJ65 helperBeanJ65;

    public String identify() {
        return "HelperBeanK65";
    }
}

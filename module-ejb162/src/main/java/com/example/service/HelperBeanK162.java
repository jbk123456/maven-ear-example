package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK162 {

    @EJB
    private HelperBeanJ162 helperBeanJ162;

    public String identify() {
        return "HelperBeanK162";
    }
}

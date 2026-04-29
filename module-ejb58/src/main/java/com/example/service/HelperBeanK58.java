package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK58 {

    @EJB
    private HelperBeanJ58 helperBeanJ58;

    public String identify() {
        return "HelperBeanK58";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK28 {

    @EJB
    private HelperBeanJ28 helperBeanJ28;

    public String identify() {
        return "HelperBeanK28";
    }
}

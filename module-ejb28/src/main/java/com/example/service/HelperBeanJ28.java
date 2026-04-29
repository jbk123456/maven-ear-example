package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ28 {

    @EJB
    private HelperBeanI28 helperBeanI28;

    public String identify() {
        return "HelperBeanJ28";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ159 {

    @EJB
    private HelperBeanI159 helperBeanI159;

    public String identify() {
        return "HelperBeanJ159";
    }
}

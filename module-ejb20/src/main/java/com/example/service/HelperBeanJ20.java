package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ20 {

    @EJB
    private HelperBeanI20 helperBeanI20;

    public String identify() {
        return "HelperBeanJ20";
    }
}

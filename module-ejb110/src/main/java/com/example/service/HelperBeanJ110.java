package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ110 {

    @EJB
    private HelperBeanI110 helperBeanI110;

    public String identify() {
        return "HelperBeanJ110";
    }
}

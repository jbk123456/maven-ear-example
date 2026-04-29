package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ140 {

    @EJB
    private HelperBeanI140 helperBeanI140;

    public String identify() {
        return "HelperBeanJ140";
    }
}

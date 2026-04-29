package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK140 {

    @EJB
    private HelperBeanJ140 helperBeanJ140;

    public String identify() {
        return "HelperBeanK140";
    }
}

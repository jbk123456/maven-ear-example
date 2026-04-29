package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK164 {

    @EJB
    private HelperBeanJ164 helperBeanJ164;

    public String identify() {
        return "HelperBeanK164";
    }
}

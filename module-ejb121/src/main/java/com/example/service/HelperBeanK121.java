package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK121 {

    @EJB
    private HelperBeanJ121 helperBeanJ121;

    public String identify() {
        return "HelperBeanK121";
    }
}

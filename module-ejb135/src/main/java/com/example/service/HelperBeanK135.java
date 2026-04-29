package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK135 {

    @EJB
    private HelperBeanJ135 helperBeanJ135;

    public String identify() {
        return "HelperBeanK135";
    }
}

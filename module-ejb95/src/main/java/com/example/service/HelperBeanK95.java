package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK95 {

    @EJB
    private HelperBeanJ95 helperBeanJ95;

    public String identify() {
        return "HelperBeanK95";
    }
}

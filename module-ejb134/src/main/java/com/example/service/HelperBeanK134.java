package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK134 {

    @EJB
    private HelperBeanJ134 helperBeanJ134;

    public String identify() {
        return "HelperBeanK134";
    }
}

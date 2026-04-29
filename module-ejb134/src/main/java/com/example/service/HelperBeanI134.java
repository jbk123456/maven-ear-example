package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI134 {

    @EJB
    private HelperBeanH134 helperBeanH134;

    public String identify() {
        return "HelperBeanI134";
    }
}

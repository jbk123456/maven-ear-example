package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH134 {

    @EJB
    private HelperBeanG134 helperBeanG134;

    public String identify() {
        return "HelperBeanH134";
    }
}

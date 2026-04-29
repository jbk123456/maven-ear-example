package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH95 {

    @EJB
    private HelperBeanG95 helperBeanG95;

    public String identify() {
        return "HelperBeanH95";
    }
}

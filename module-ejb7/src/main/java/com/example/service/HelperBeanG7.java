package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG7 {

    @EJB
    private HelperBeanF7 helperBeanF7;

    public String identify() {
        return "HelperBeanG7";
    }
}

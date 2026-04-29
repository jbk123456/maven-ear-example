package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH7 {

    @EJB
    private HelperBeanG7 helperBeanG7;

    public String identify() {
        return "HelperBeanH7";
    }
}

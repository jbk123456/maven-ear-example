package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH65 {

    @EJB
    private HelperBeanG65 helperBeanG65;

    public String identify() {
        return "HelperBeanH65";
    }
}

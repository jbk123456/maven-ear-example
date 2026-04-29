package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG35 {

    @EJB
    private HelperBeanF35 helperBeanF35;

    public String identify() {
        return "HelperBeanG35";
    }
}

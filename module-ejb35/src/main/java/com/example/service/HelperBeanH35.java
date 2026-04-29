package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH35 {

    @EJB
    private HelperBeanG35 helperBeanG35;

    public String identify() {
        return "HelperBeanH35";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH88 {

    @EJB
    private HelperBeanG88 helperBeanG88;

    public String identify() {
        return "HelperBeanH88";
    }
}

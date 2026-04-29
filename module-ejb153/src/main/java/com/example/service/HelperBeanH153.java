package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH153 {

    @EJB
    private HelperBeanG153 helperBeanG153;

    public String identify() {
        return "HelperBeanH153";
    }
}

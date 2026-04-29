package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG153 {

    @EJB
    private HelperBeanF153 helperBeanF153;

    public String identify() {
        return "HelperBeanG153";
    }
}

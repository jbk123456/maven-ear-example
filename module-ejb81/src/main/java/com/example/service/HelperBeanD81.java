package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD81 {

    @EJB
    private HelperBeanC81 helperBeanC81;

    public String identify() {
        return "HelperBeanD81";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK109 {

    @EJB
    private HelperBeanJ109 helperBeanJ109;

    public String identify() {
        return "HelperBeanK109";
    }
}

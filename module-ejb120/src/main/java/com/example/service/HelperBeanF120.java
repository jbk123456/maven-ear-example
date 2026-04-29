package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF120 {

    @EJB
    private HelperBeanE120 helperBeanE120;

    public String identify() {
        return "HelperBeanF120";
    }
}

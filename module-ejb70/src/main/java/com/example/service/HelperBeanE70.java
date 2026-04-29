package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE70 {

    @EJB
    private HelperBeanD70 helperBeanD70;

    public String identify() {
        return "HelperBeanE70";
    }
}

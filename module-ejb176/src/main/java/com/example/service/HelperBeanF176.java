package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF176 {

    @EJB
    private HelperBeanE176 helperBeanE176;

    public String identify() {
        return "HelperBeanF176";
    }
}

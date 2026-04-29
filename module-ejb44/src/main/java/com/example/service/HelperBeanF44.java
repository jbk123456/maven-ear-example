package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF44 {

    @EJB
    private HelperBeanE44 helperBeanE44;

    public String identify() {
        return "HelperBeanF44";
    }
}

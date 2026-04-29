package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE129 {

    @EJB
    private HelperBeanD129 helperBeanD129;

    public String identify() {
        return "HelperBeanE129";
    }
}

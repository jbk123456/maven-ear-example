package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF129 {

    @EJB
    private HelperBeanE129 helperBeanE129;

    public String identify() {
        return "HelperBeanF129";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF127 {

    @EJB
    private HelperBeanE127 helperBeanE127;

    public String identify() {
        return "HelperBeanF127";
    }
}

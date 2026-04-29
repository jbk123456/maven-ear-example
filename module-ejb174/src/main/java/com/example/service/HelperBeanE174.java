package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE174 {

    @EJB
    private HelperBeanD174 helperBeanD174;

    public String identify() {
        return "HelperBeanE174";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG174 {

    @EJB
    private HelperBeanF174 helperBeanF174;

    public String identify() {
        return "HelperBeanG174";
    }
}

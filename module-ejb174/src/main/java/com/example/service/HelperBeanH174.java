package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH174 {

    @EJB
    private HelperBeanG174 helperBeanG174;

    public String identify() {
        return "HelperBeanH174";
    }
}

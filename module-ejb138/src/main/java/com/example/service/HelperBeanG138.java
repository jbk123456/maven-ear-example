package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG138 {

    @EJB
    private HelperBeanF138 helperBeanF138;

    public String identify() {
        return "HelperBeanG138";
    }
}

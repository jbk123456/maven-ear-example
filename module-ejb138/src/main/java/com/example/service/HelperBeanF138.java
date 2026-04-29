package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF138 {

    @EJB
    private HelperBeanE138 helperBeanE138;

    public String identify() {
        return "HelperBeanF138";
    }
}

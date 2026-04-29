package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF174 {

    @EJB
    private HelperBeanE174 helperBeanE174;

    public String identify() {
        return "HelperBeanF174";
    }
}

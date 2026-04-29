package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL174 {

    @EJB
    private HelperBeanK174 helperBeanK174;

    public String identify() {
        return "HelperBeanL174";
    }
}

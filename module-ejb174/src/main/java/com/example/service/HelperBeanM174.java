package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM174 {

    @EJB
    private HelperBeanL174 helperBeanL174;

    public String identify() {
        return "HelperBeanM174";
    }
}

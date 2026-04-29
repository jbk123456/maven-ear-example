package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF167 {

    @EJB
    private HelperBeanE167 helperBeanE167;

    public String identify() {
        return "HelperBeanF167";
    }
}

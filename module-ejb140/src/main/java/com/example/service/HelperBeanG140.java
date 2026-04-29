package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG140 {

    @EJB
    private HelperBeanF140 helperBeanF140;

    public String identify() {
        return "HelperBeanG140";
    }
}

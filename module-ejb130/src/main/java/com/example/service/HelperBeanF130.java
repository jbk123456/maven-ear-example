package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF130 {

    @EJB
    private HelperBeanE130 helperBeanE130;

    public String identify() {
        return "HelperBeanF130";
    }
}

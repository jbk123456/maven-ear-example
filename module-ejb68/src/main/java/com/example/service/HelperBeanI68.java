package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI68 {

    @EJB
    private HelperBeanH68 helperBeanH68;

    public String identify() {
        return "HelperBeanI68";
    }
}

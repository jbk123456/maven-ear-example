package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ116 {

    @EJB
    private HelperBeanI116 helperBeanI116;

    public String identify() {
        return "HelperBeanJ116";
    }
}

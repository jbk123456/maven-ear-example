package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE167 {

    @EJB
    private HelperBeanD167 helperBeanD167;

    public String identify() {
        return "HelperBeanE167";
    }
}

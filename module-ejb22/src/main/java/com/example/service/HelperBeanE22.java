package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE22 {

    @EJB
    private HelperBeanD22 helperBeanD22;

    public String identify() {
        return "HelperBeanE22";
    }
}

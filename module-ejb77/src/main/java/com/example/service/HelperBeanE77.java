package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE77 {

    @EJB
    private HelperBeanD77 helperBeanD77;

    public String identify() {
        return "HelperBeanE77";
    }
}

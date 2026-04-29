package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF77 {

    @EJB
    private HelperBeanE77 helperBeanE77;

    public String identify() {
        return "HelperBeanF77";
    }
}

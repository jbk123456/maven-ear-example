package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF37 {

    @EJB
    private HelperBeanE37 helperBeanE37;

    public String identify() {
        return "HelperBeanF37";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD68 {

    @EJB
    private HelperBeanC68 helperBeanC68;

    public String identify() {
        return "HelperBeanD68";
    }
}

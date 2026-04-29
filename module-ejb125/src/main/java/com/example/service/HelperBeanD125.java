package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD125 {

    @EJB
    private HelperBeanC125 helperBeanC125;

    public String identify() {
        return "HelperBeanD125";
    }
}

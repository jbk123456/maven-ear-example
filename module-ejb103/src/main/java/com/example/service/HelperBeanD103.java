package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD103 {

    @EJB
    private HelperBeanC103 helperBeanC103;

    public String identify() {
        return "HelperBeanD103";
    }
}

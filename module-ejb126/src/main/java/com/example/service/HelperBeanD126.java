package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD126 {

    @EJB
    private HelperBeanC126 helperBeanC126;

    public String identify() {
        return "HelperBeanD126";
    }
}

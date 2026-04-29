package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD25 {

    @EJB
    private HelperBeanC25 helperBeanC25;

    public String identify() {
        return "HelperBeanD25";
    }
}

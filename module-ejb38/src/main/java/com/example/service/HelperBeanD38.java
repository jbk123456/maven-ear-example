package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD38 {

    @EJB
    private HelperBeanC38 helperBeanC38;

    public String identify() {
        return "HelperBeanD38";
    }
}

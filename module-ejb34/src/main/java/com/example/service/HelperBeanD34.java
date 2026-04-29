package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD34 {

    @EJB
    private HelperBeanC34 helperBeanC34;

    public String identify() {
        return "HelperBeanD34";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC34 {

    @EJB
    private HelperBeanB34 helperBeanB34;

    public String identify() {
        return "HelperBeanC34";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD158 {

    @EJB
    private HelperBeanC158 helperBeanC158;

    public String identify() {
        return "HelperBeanD158";
    }
}

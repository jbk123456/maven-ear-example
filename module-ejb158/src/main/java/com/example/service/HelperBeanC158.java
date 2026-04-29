package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC158 {

    @EJB
    private HelperBeanB158 helperBeanB158;

    public String identify() {
        return "HelperBeanC158";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC87 {

    @EJB
    private HelperBeanB87 helperBeanB87;

    public String identify() {
        return "HelperBeanC87";
    }
}

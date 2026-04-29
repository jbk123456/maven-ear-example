package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC174 {

    @EJB
    private HelperBeanB174 helperBeanB174;

    public String identify() {
        return "HelperBeanC174";
    }
}

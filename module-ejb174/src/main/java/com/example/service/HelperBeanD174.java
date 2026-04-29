package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD174 {

    @EJB
    private HelperBeanC174 helperBeanC174;

    public String identify() {
        return "HelperBeanD174";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC167 {

    @EJB
    private HelperBeanB167 helperBeanB167;

    public String identify() {
        return "HelperBeanC167";
    }
}

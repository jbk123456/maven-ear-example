package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC154 {

    @EJB
    private HelperBeanB154 helperBeanB154;

    public String identify() {
        return "HelperBeanC154";
    }
}

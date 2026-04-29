package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC150 {

    @EJB
    private HelperBeanB150 helperBeanB150;

    public String identify() {
        return "HelperBeanC150";
    }
}

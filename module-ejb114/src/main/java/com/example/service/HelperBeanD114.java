package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD114 {

    @EJB
    private HelperBeanC114 helperBeanC114;

    public String identify() {
        return "HelperBeanD114";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC35 {

    @EJB
    private HelperBeanB35 helperBeanB35;

    public String identify() {
        return "HelperBeanC35";
    }
}

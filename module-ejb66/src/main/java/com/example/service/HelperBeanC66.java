package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC66 {

    @EJB
    private HelperBeanB66 helperBeanB66;

    public String identify() {
        return "HelperBeanC66";
    }
}

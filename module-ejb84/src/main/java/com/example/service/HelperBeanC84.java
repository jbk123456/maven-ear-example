package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC84 {

    @EJB
    private HelperBeanB84 helperBeanB84;

    public String identify() {
        return "HelperBeanC84";
    }
}

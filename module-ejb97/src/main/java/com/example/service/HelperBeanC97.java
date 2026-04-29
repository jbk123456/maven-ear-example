package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC97 {

    @EJB
    private HelperBeanB97 helperBeanB97;

    public String identify() {
        return "HelperBeanC97";
    }
}

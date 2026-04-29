package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD97 {

    @EJB
    private HelperBeanC97 helperBeanC97;

    public String identify() {
        return "HelperBeanD97";
    }
}

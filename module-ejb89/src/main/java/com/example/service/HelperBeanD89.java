package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD89 {

    @EJB
    private HelperBeanC89 helperBeanC89;

    public String identify() {
        return "HelperBeanD89";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC89 {

    @EJB
    private HelperBeanB89 helperBeanB89;

    public String identify() {
        return "HelperBeanC89";
    }
}

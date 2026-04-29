package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC68 {

    @EJB
    private HelperBeanB68 helperBeanB68;

    public String identify() {
        return "HelperBeanC68";
    }
}

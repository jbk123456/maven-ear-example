package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC152 {

    @EJB
    private HelperBeanB152 helperBeanB152;

    public String identify() {
        return "HelperBeanC152";
    }
}

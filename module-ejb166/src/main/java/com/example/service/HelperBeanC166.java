package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC166 {

    @EJB
    private HelperBeanB166 helperBeanB166;

    public String identify() {
        return "HelperBeanC166";
    }
}

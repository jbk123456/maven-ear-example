package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC121 {

    @EJB
    private HelperBeanB121 helperBeanB121;

    public String identify() {
        return "HelperBeanC121";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD36 {

    @EJB
    private HelperBeanC36 helperBeanC36;

    public String identify() {
        return "HelperBeanD36";
    }
}

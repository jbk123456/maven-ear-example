package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD60 {

    @EJB
    private HelperBeanC60 helperBeanC60;

    public String identify() {
        return "HelperBeanD60";
    }
}

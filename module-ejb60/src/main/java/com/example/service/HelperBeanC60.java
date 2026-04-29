package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC60 {

    @EJB
    private HelperBeanB60 helperBeanB60;

    public String identify() {
        return "HelperBeanC60";
    }
}

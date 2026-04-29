package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC46 {

    @EJB
    private HelperBeanB46 helperBeanB46;

    public String identify() {
        return "HelperBeanC46";
    }
}

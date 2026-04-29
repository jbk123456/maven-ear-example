package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC82 {

    @EJB
    private HelperBeanB82 helperBeanB82;

    public String identify() {
        return "HelperBeanC82";
    }
}

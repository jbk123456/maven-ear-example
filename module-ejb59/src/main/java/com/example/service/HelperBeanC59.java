package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC59 {

    @EJB
    private HelperBeanB59 helperBeanB59;

    public String identify() {
        return "HelperBeanC59";
    }
}

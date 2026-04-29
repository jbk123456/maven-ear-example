package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC125 {

    @EJB
    private HelperBeanB125 helperBeanB125;

    public String identify() {
        return "HelperBeanC125";
    }
}

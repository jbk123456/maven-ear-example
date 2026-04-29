package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC31 {

    @EJB
    private HelperBeanB31 helperBeanB31;

    public String identify() {
        return "HelperBeanC31";
    }
}

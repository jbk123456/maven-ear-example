package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC77 {

    @EJB
    private HelperBeanB77 helperBeanB77;

    public String identify() {
        return "HelperBeanC77";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC114 {

    @EJB
    private HelperBeanB114 helperBeanB114;

    public String identify() {
        return "HelperBeanC114";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ69 {

    @EJB
    private HelperBeanI69 helperBeanI69;

    public String identify() {
        return "HelperBeanJ69";
    }
}

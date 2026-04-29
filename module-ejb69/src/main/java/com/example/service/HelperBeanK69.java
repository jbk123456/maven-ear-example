package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK69 {

    @EJB
    private HelperBeanJ69 helperBeanJ69;

    public String identify() {
        return "HelperBeanK69";
    }
}

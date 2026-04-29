package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC177 {

    @EJB
    private HelperBeanB177 helperBeanB177;

    public String identify() {
        return "HelperBeanC177";
    }
}

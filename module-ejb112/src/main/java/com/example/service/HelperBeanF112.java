package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF112 {

    @EJB
    private HelperBeanE112 helperBeanE112;

    public String identify() {
        return "HelperBeanF112";
    }
}

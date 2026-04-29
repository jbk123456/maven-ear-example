package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC112 {

    @EJB
    private HelperBeanB112 helperBeanB112;

    public String identify() {
        return "HelperBeanC112";
    }
}

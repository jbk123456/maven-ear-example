package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC56 {

    @EJB
    private HelperBeanB56 helperBeanB56;

    public String identify() {
        return "HelperBeanC56";
    }
}

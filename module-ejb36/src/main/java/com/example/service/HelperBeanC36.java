package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC36 {

    @EJB
    private HelperBeanB36 helperBeanB36;

    public String identify() {
        return "HelperBeanC36";
    }
}

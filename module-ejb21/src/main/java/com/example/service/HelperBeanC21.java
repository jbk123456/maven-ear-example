package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC21 {

    @EJB
    private HelperBeanB21 helperBeanB21;

    public String identify() {
        return "HelperBeanC21";
    }
}

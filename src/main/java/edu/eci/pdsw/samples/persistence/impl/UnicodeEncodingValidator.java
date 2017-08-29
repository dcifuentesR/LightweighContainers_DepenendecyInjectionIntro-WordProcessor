/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.impl;

import java.util.logging.Logger;

import edu.eci.pdsw.samples.persistence.EncodingValidator;

/**
 *
 * @author hcadavid
 */
public class UnicodeEncodingValidator implements EncodingValidator{


    public boolean validateEncoding(String text) {
        LOG.info("Validating UNICODE-Enconding for text....");
        return true;
    }
    private static final Logger LOG = Logger.getLogger(UnicodeEncodingValidator.class.getName());
  
    
    
    
}

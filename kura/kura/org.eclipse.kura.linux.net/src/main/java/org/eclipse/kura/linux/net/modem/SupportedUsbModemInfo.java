/**
 * Copyright (c) 2011, 2014 Eurotech and/or its affiliates
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Eurotech
 */
package org.eclipse.kura.linux.net.modem;

import java.util.Arrays;
import java.util.List;

import org.eclipse.kura.net.modem.ModemTechnologyType;

public enum SupportedUsbModemInfo {

			// device name,     vendor, product, ttyDevs, blockDevs, AT Port, Data Port, technology types, device driver
    Telit_HE910_D   ("HE910-D",  "1bc7", "0021", 7, 0, 3, 0, Arrays.asList(ModemTechnologyType.HSDPA), Arrays.asList(new UsbModemDriver("cdc_acm"))),
    Telit_GE910		("GE910", "1bc7", "0022", 2, 0, 0, 1, Arrays.asList(ModemTechnologyType.HSDPA), Arrays.asList(new UsbModemDriver("cdc_acm"))),
    Telit_DE910_DUAL("DE910-DUAL",  "1bc7", "1010", 4, 0, 2, 3, Arrays.asList(ModemTechnologyType.EVDO), Arrays.asList(new De910ModemDriver())),
    Telit_LE910		("LE910", "1bc7", "1201", 7, 1, 4, 5, Arrays.asList(ModemTechnologyType.HSDPA), Arrays.asList(new Le910ModemDriver())),
    Telit_CE910_DUAL("CE910-DUAL", "1bc7", "1011", 2, 0, 1, 1, Arrays.asList(ModemTechnologyType.EVDO), Arrays.asList(new Ce910ModemDriver())),
    Sierra_MC8775   ("MC8775", "1199", "6812", 3, 0, 2, 0, Arrays.asList(ModemTechnologyType.HSDPA), Arrays.asList(new UsbModemDriver("sierra"))),
    Sierra_MC8790   ("MC8790", "1199", "683c", 7, 0, 3, 4, Arrays.asList(ModemTechnologyType.HSDPA), Arrays.asList(new UsbModemDriver("sierra"))),
    Sierra_USB598   ("USB598", "1199", "0025", 4, 1, 0, 0, Arrays.asList(ModemTechnologyType.EVDO), Arrays.asList(new UsbModemDriver("sierra")));

    private String m_deviceName;
    private String m_vendorId;
    private String m_productId;
    private int m_numTtyDevs;
    private int m_numBlockDevs;
    
    private int m_atPort;
    private int m_dataPort;
    
    private List<ModemTechnologyType> m_technologyTypes;
    private List<? extends UsbModemDriver> m_deviceDrivers;
    
    private SupportedUsbModemInfo(String deviceName, String vendorId, String productId, int numTtyDevs, int numBlockDevs,
            int atPort, int dataPort, List<ModemTechnologyType> modemTechnology, List<? extends UsbModemDriver> drivers) {
        m_deviceName = deviceName;
        m_vendorId = vendorId;
        m_productId = productId;
        m_numTtyDevs = numTtyDevs;
        m_numBlockDevs = numBlockDevs;
        m_atPort = atPort;
        m_dataPort = dataPort;
        m_technologyTypes = modemTechnology;
        m_deviceDrivers = drivers;
    }
    
    public String getDeviceName() {
        return m_deviceName;
    }
    
    public List<? extends UsbModemDriver> getDeviceDrivers() {
    	return m_deviceDrivers;
    }
    
    public String getVendorId() {
        return m_vendorId;
    }
    
    public String getProductId() {
        return m_productId;
    }
    
    public int getNumTtyDevs() {
        return m_numTtyDevs;
    }
    
    public int getNumBlockDevs() {
        return m_numBlockDevs;
    }
    
    public int getAtPort() {
    	return m_atPort;
    }
    
    public int getDataPort() {
    	return m_dataPort;
    }
    
    public List<ModemTechnologyType> getTechnologyTypes() {
        return m_technologyTypes;
    }
}

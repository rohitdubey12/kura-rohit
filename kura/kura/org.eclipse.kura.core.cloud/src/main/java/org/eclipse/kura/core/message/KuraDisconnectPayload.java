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
package org.eclipse.kura.core.message;

import java.util.Iterator;

import org.eclipse.kura.message.KuraPayload;

public class KuraDisconnectPayload extends KuraPayload 
{
	private final static String UPTIME = "uptime";
	private final static String DISPLAY_NAME = "display_name";
	
	
	public KuraDisconnectPayload(String uptime, String displayName) {
		super();
		
		addMetric(UPTIME, uptime);
		addMetric(DISPLAY_NAME, displayName);
	}
	
	public KuraDisconnectPayload(KuraPayload KuraMessage) 
	{
		Iterator<String> hdrIterator = KuraMessage.metricsIterator();		
		while (hdrIterator.hasNext()) {
			String hdrName = hdrIterator.next();
			String hdrVal = (String)KuraMessage.getMetric(hdrName);			
			addMetric(hdrName, hdrVal);
		}		
		setBody(KuraMessage.getBody());
	}
	
	public String getUptime() {
		return (String) getMetric(UPTIME);
	}
	public String getDisplayName() {
		return (String) getMetric(DISPLAY_NAME);
	}
	
	@Override
	public String toString() {
		return "KuraBirthMessage [getUptime()=" + getUptime() + ", getDisplayName()=" + getDisplayName() + "]";
	}
}

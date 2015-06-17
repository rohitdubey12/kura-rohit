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
package org.eclipse.kura.web.client;

import org.eclipse.kura.web.client.messages.Messages;
import org.eclipse.kura.web.client.ui.DenaliUi;
import org.eclipse.kura.web.shared.service.GwtDeviceService;
import org.eclipse.kura.web.shared.service.GwtDeviceServiceAsync;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class denali implements EntryPoint 
{
	private static final Messages MSGS = GWT.create(Messages.class);
	//private final boolean VIEW_LOG = true;
	private final GwtDeviceServiceAsync gwtDeviceService = GWT.create(GwtDeviceService.class);
	private final DenaliUi binder = GWT.create(DenaliUi.class);

	/**
	 * Note, we defer all application initialization code to
	 * {@link #onModuleLoad2()} so that the UncaughtExceptionHandler can catch
	 * any unexpected exceptions.
	 */
	public void onModuleLoad() 
	{
		/*
	     * Install an UncaughtExceptionHandler which will produce <code>FATAL</code> log messages
	     */
	    Log.setUncaughtExceptionHandler();

	    /*
	    // Disable the web UI log view unless VIEW_LOG is set to true
	    if (!VIEW_LOG) {
	    	Widget divLogger = Log.getLogger(DivLogger.class).getWidget();
	    	divLogger.setVisible(false);
	    }
	    */
		// use deferred command to catch initialization exceptions in
		// onModuleLoad2
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			public void execute() {
				onModuleLoad2();
			}
		});
	}

	
	/**
	 * This is the 'real' entry point method.
	 */
	public void onModuleLoad2() {
		
		System.out.println("Initiating UI Render");
		RootPanel.get().add(binder);

    }
}

package org.eclipse.kura.web.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class DenaliUi extends Composite {

	interface DenaliUiUiBinder extends UiBinder<Widget, DenaliUi> {
	}


	private static DenaliUiUiBinder uiBinder = GWT
			.create(DenaliUiUiBinder.class);

	public DenaliUi() {
		System.out.println("Initiating Ui binder");
		initWidget(uiBinder.createAndBindUi(this));
	}

}

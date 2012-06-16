package com.manning.gwtia.ch15.client.mvp;

import com.manning.gwtia.ch15.client.mvp.views.PhotoDetailsView;
import com.manning.gwtia.ch15.client.mvp.views.PhotoListView;
import com.manning.gwtia.ch15.client.mvp.views.WelcomeView;
import com.manning.gwtia.ch15.client.mvp.views.hardcoded.PhotoDetailsViewImpl;
import com.manning.gwtia.ch15.client.mvp.views.hardcoded.PhotoListViewImpl;
import com.manning.gwtia.ch15.client.mvp.views.hardcoded.WelcomeViewImpl;

public class ClientFactoryHardCodedImpl extends ClientFactoryBaseImpl{


	private static PhotoDetailsView detailView;
	private static PhotoListView listView;
	private static WelcomeView welcomeView;

	public PhotoDetailsView getPhotoView() {
		if (detailView == null) detailView = new PhotoDetailsViewImpl();
		return detailView;
	}

	public PhotoListView getListView() {
		if (listView == null) listView = new PhotoListViewImpl();
		return listView;
	}

	public WelcomeView getWelcomeView() {
		if (welcomeView == null) welcomeView = new WelcomeViewImpl();
		return welcomeView;
	}
}

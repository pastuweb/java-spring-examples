package net.appuntivari.wicketapp.pages;

import net.appuntivari.wicketapp.init.WicketService;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class Home extends WebPage {

	@SpringBean
	private WicketService wicketService;

	public Home(final PageParameters parameters) {

		add(new Label("msg", wicketService.getUtenti()));

	}

	
	public WicketService getWicketService() {
		return this.wicketService;
	}
	public void setWicketService(WicketService wicketService) {
		this.wicketService = wicketService;
	}



}

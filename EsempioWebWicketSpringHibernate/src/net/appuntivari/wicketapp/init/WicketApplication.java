package net.appuntivari.wicketapp.init;

import net.appuntivari.wicketapp.pages.Home;

import org.apache.wicket.Application;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

public class WicketApplication extends WebApplication{

		@Override
		public Class getHomePage() {

			return Home.class; // return default page
		}
		
		@Override
		protected void init() {
			
			super.init();
			addComponentInstantiationListener(new SpringComponentInjector(this));
			 
		}
		
		@Override
		public String getConfigurationType() {
			
			return Application.DEPLOYMENT;
			
		}

}

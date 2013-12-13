package com.buongiorno.utils;

import java.io.IOException;
import java.util.Properties;

public class ReadProperites {
	
	private String mensaje;

//meto un comentario
	private void readConfiguration()throws IOException {

		Properties config = new Properties();

		config.load(this.getClass().getResourceAsStream("/smal_project.properties"));
		mensaje = config.getProperty("website");
		
	}
		
	public String getmensaje() {
		return mensaje;
	}

	public void setmensaje(String mensaje) {
		this.mensaje = mensaje;
	}


}

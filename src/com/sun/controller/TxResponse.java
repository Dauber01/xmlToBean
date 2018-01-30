package com.sun.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class TxResponse {
	
	private ResponseObject responseObject;

	public TxResponse() {
		super();
	}
	
	public TxResponse(ResponseObject responseObject) {
		super();
		this.responseObject = responseObject;
	}
	@XmlElement(name = "ResponseObject")
	public ResponseObject getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(ResponseObject responseObject) {
		this.responseObject = responseObject;
	}
}

package com.sun.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class ResponseObject {
	
	private TCRMPersonBObj tCRMPersonBObj;

	public ResponseObject() {
		super();
	}

	public ResponseObject(TCRMPersonBObj tCRMPersonBObj) {
		super();
		this.tCRMPersonBObj = tCRMPersonBObj;
	}
	@XmlElement(name = "TCRMPersonBObj")
	public TCRMPersonBObj gettCRMPersonBObj() {
		return tCRMPersonBObj;
	}

	public void settCRMPersonBObj(TCRMPersonBObj tCRMPersonBObj) {
		this.tCRMPersonBObj = tCRMPersonBObj;
	}
	
}

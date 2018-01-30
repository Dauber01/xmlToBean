package com.sun.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class TCRMPartyContactMethodBObj {
	
	private TCRMContactMethodBObj tCRMContactMethodBObj;

	public TCRMPartyContactMethodBObj() {
		super();
	}

	public TCRMPartyContactMethodBObj(
			TCRMContactMethodBObj tCRMContactMethodBObj) {
		super();
		this.tCRMContactMethodBObj = tCRMContactMethodBObj;
	}
	@XmlElement(name = "TCRMContactMethodBObj")
	public TCRMContactMethodBObj gettCRMContactMethodBObj() {
		return tCRMContactMethodBObj;
	}

	public void settCRMContactMethodBObj(TCRMContactMethodBObj tCRMContactMethodBObj) {
		this.tCRMContactMethodBObj = tCRMContactMethodBObj;
	}
	
}

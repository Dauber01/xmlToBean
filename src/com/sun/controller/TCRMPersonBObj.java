package com.sun.controller;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

public class TCRMPersonBObj {
	
	private List<TCRMPartyContactMethodBObj> tCRMPartyContactMethodBObjs;

	public TCRMPersonBObj() {
		super();
	}

	public TCRMPersonBObj(List<TCRMPartyContactMethodBObj> tCRMPartyContactMethodBObjs) {
		super();
		this.tCRMPartyContactMethodBObjs = tCRMPartyContactMethodBObjs;
	}
	@XmlElement(name = "TCRMPartyContactMethodBObj")
	public List<TCRMPartyContactMethodBObj> gettCRMPartyContactMethodBObjs() {
		return tCRMPartyContactMethodBObjs;
	}

	public void settCRMPartyContactMethodBObjs(
			List<TCRMPartyContactMethodBObj> tCRMPartyContactMethodBObjs) {
		this.tCRMPartyContactMethodBObjs = tCRMPartyContactMethodBObjs;
	}
	
	
}

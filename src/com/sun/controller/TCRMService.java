@XmlSchema(
		namespace = "http://www.ibm.com/mdm/schema",
		elementFormDefault = XmlNsForm.QUALIFIED,
		xmlns = {
				@XmlNs(prefix="",
			namespaceURI = "http://www.ibm.com/mdm/schema"
			)
		})
package com.sun.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlNs;;
import javax.xml.bind.annotation.XmlRootEleme
import javax.xml.bind.annotation.XmlSchema;nt;

@XmlRootElement(name = "TCRMService",namespace = "http://www.ibm.com/mdm/schema")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class TCRMService {
private TxResponse txResponse;
	
	public TCRMService() {
		super();
	}
	public TCRMService(TxResponse txResponse) {
		super();
		this.txResponse = txResponse;
	}
	@XmlElement(name = "TxResponse")
	public TxResponse getTxResponse() {
		return txResponse;
	}
	public void setTxResponse(TxResponse txResponse) {
		this.txResponse = txResponse;
	}
	
}

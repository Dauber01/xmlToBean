package com.sun.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class TCRMContactMethodBObj {
	//鑱旂郴鏂瑰紡绫诲瀷锛�6-寰俊openid锛屾湁鍙兘涓嶅瓨鍦級
	private String contactMethodType;
	//鑱旂郴鏂瑰紡鍐呭锛堢被鍨嬩负6鐨勫搴斿�间负openid锛�
	private String referenceNumber;
	
	public TCRMContactMethodBObj() {
		super();
	}
	public TCRMContactMethodBObj(String contactMethodType,
			String referenceNumber) {
		super();
		this.contactMethodType = contactMethodType;
		this.referenceNumber = referenceNumber;
	}
	@XmlElement(name = "ContactMethodType")
	public String getContactMethodType() {
		return contactMethodType;
	}
	public void setContactMethodType(String contactMethodType) {
		this.contactMethodType = contactMethodType;
	}
	@XmlElement(name = "ReferenceNumber")
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	
}

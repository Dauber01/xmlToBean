package com.sun.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            JAXBContext jaxbContext = JAXBContext.newInstance(TCRMService.class);
	            File file = new File("D:\\eclipse-workspace\\xmlToBean\\src\\com\\sun\\controller\\Test1.xml");
//	            SAXReader reader = new SAXReader();
//	            Document doc = reader.read(file);
	//D:\\eclipse-workspace\\xmlToBean\\src\\com\\sun\\controller\\Test1.xml
//	           String xml = doc.asXML();2
	           Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	           TCRMService tcrmService = (TCRMService) unmarshaller.unmarshal(file);
	            System.out.println(tcrmService.getTxResponse().getResponseObject().gettCRMPersonBObj().gettCRMPartyContactMethodBObjs().get(0).gettCRMContactMethodBObj().getContactMethodType());
	        }catch (Exception e) {
	            System.out.println(e.toString());
	        }
	}

}
operation.getReturnClass()!=java.xml.soap.SOAPMessage.class
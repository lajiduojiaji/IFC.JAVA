// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedMgmtElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcSharedMgmtElements.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcControl;

@Guid("7045cc64-c05a-4a43-aaa5-b5b4d849f3f5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcActionRequest extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@Description("Identifies the predefined type of sources through which a request can be made.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@DataMember(Order = 0)
	@Guid("04d1554b-e1df-4af5-b21d-47c6f248a9a0")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcActionRequestTypeEnum predefinedType;

	@Description("The status currently assigned to the request.  Possible values include:<br/>  Hold: wait to see if further requests are received before deciding on action<br/>  NoAction: no action is required on this request<br/>  Schedule: plan action to take place as part of maintenance or other task planning/scheduling<br/>  Urgent: take action immediately<br/>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@DataMember(Order = 1)
	@Guid("c98c93dd-884d-46da-b5e2-2d3e00098829")
	@JacksonXmlProperty(isAttribute=true, localName = "Status")
	private String status;

	@Description("Detailed description of the permit.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@DataMember(Order = 2)
	@Guid("cf5a062f-d588-48de-8962-d74ad1d29328")
	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	private String longDescription;


	public IfcActionRequest()
	{
	}

	public IfcActionRequest(String globalId)
	{
		super(globalId);
	}

	public IfcActionRequestTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcActionRequestTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


}


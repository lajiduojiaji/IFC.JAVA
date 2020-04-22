// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

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
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.*;
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionResourceType;
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionEquipmentResourceTypeEnum;

@Guid("0183b4f6-26f5-49bc-be00-a887d350340e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConstructionEquipmentResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of construction equipment resources.  <p></p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("99d4b03f-35f6-42c2-92ff-4620180871f2")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcConstructionEquipmentResourceTypeEnum predefinedType;


	public IfcConstructionEquipmentResourceType()
	{
	}

	public IfcConstructionEquipmentResourceType(String globalId, IfcConstructionEquipmentResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcConstructionEquipmentResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcConstructionEquipmentResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}


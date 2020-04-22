// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcOpeningElement;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcVoidingFeature;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElement;

@Guid("c881faa0-78d9-40af-a83e-a4924a575869")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcOpeningElement.class, name = "IfcOpeningElement"), @JsonSubTypes.Type(value = IfcVoidingFeature.class, name = "IfcVoidingFeature")})
public abstract class IfcFeatureElementSubtraction extends IfcFeatureElement
{
	@Description("Reference to the Voids Relationship that uses this Opening Element to create a void within an Element. The Opening Element can only be used to create a single void within a single Element.")
	@InverseProperty(InverseProp = "RelatedOpeningElement", Range = "IfcRelVoidsElement")
	@Guid("094eb37f-0822-4b0d-9fcc-e87be21592b4")
	@JacksonXmlProperty(isAttribute=false, localName = "VoidsElements")
	@JsonIgnore
	private IfcRelVoidsElement voidsElements;


	public IfcFeatureElementSubtraction()
	{
	}

	public IfcFeatureElementSubtraction(String globalId)
	{
		super(globalId);
	}

	public IfcRelVoidsElement getVoidsElements() {
		return this.voidsElements;
	}

	public void setVoidsElements(IfcRelVoidsElement voidsElements) {
		this.voidsElements = voidsElements;
	}


}


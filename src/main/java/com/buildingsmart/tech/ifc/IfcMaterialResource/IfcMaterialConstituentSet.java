// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

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
import com.buildingsmart.tech.ifc.IfcMaterialResource.*;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition;

@Guid("b99a5da2-c2da-4aef-add4-cbb2ab49a83d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialConstituentSet extends IfcMaterialDefinition
{
	@Description("The name by which the constituent set is known.")
	@DataMember(Order = 0)
	@Guid("77439756-de1e-42cf-8121-b87d99cb1b33")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Definition of the material constituent set in descriptive terms.")
	@DataMember(Order = 1)
	@Guid("052c3816-894c-4bb0-a183-783129ae3c06")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("Identification of the constituents from which the material constituent set is composed.")
	@DataMember(Order = 2)
	@Guid("c544c8f3-7b99-4dcb-9ed8-a74a1954f0ee")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialConstituent")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "MaterialConstituents")
	private Set<IfcMaterialConstituent> materialConstituents;


	public IfcMaterialConstituentSet()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<IfcMaterialConstituent> getMaterialConstituents() {
		return this.materialConstituents;
	}


}


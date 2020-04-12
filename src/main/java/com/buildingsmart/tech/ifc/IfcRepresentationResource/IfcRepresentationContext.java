// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("38217e82-b534-4baa-87a6-49402ed0a52c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcGeometricRepresentationContext.class, name = "IfcGeometricRepresentationContext"))
public abstract class IfcRepresentationContext
{
	@Description("The optional identifier of the representation context as used within a project.")
	@DataMember(Order = 0)
	@Guid("98c7faf4-7709-4f0a-9ab4-c1e8c7d0f012")
	@JacksonXmlProperty(isAttribute=true, localName = "ContextIdentifier")
	private String contextIdentifier;

	@Description("The description of the type of a representation context. The supported values for context type are to be specified by implementers agreements.")
	@DataMember(Order = 1)
	@Guid("60350fff-c598-4635-a106-9b50ce5ec88c")
	@JacksonXmlProperty(isAttribute=true, localName = "ContextType")
	private String contextType;

	@Description("All shape representations that are defined in the same representation context.")
	@Guid("1e0f4b5c-3ad8-4ee7-8998-0a6b915be556")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRepresentation")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RepresentationsInContext")
	private Set<IfcRepresentation> representationsInContext;


	public IfcRepresentationContext()
	{
	}

	public String getContextIdentifier() {
		return this.contextIdentifier;
	}

	public void setContextIdentifier(String contextIdentifier) {
		this.contextIdentifier = contextIdentifier;
	}

	public String getContextType() {
		return this.contextType;
	}

	public void setContextType(String contextType) {
		this.contextType = contextType;
	}

	public Set<IfcRepresentation> getRepresentationsInContext() {
		return this.representationsInContext;
	}


}


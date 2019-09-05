// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ca6074f0-a8aa-4b5b-a402-931d20010f8b")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcReinforcingElement extends com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent
{
	@JacksonXmlProperty(isAttribute=true, localName = "SteelGrade")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use material association at <em>IfcReinforcingElementType</em> instead.</blockquote>")
	@Guid("cc4f684c-9582-4577-b0f1-3dceb69e65f9")
	private String steelGrade;


	public IfcReinforcingElement()
	{
	}

	public IfcReinforcingElement(String globalId)
	{
		super(globalId);
	}

	public String getSteelGrade() {
		return this.steelGrade;
	}

	public void setSteelGrade(String steelGrade) {
		this.steelGrade = steelGrade;
	}


}

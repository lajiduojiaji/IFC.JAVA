// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("42fca5dd-e781-41ae-b6cd-728492fe33cf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcExtrudedAreaSolidTapered extends IfcExtrudedAreaSolid
{
	@JacksonXmlProperty(isAttribute=false, localName = "EndSweptArea")
	@Description("The surface defining the end of the swept area. It is given as a profile definition. The position coordinate system of the <em>EndSwptArea</em> is generated by translating the <em>SELF\\IfcSweptAreaSolid.Position</em> along the <em>SELF\\IfcExtrudedAreaSolid.ExtrudedDirection</em> by the distance of <em>SELF\\IfcExtrudedAreaSolid.Depth</em>.")
	@Required()
	@Guid("d3450da0-8a2e-42a2-b61c-1c7a2edddf1f")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef endSweptArea;


	public IfcExtrudedAreaSolidTapered()
	{
	}

	public IfcExtrudedAreaSolidTapered(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptArea, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection extrudedDirection, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth, com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef endSweptArea)
	{
		super(sweptArea, extrudedDirection, depth);
		this.endSweptArea = endSweptArea;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getEndSweptArea() {
		return this.endSweptArea;
	}

	public void setEndSweptArea(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef endSweptArea) {
		this.endSweptArea = endSweptArea;
	}


}

// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcControlExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("89092d99-ed3e-4f8f-8bdb-84d0cc7b5bc0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesConstraint extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates
{
	@JacksonXmlProperty(isAttribute=true, localName = "Intent")
	@Description("The intent of the constraint usage with regard to its related IfcConstraint and IfcObjects, IfcPropertyDefinitions or IfcRelationships. Typical values can be e.g. RATIONALE or EXPECTED PERFORMANCE.")
	@Guid("368764f1-6454-4339-83cd-d5fb74a70d96")
	private String intent;

	@JacksonXmlProperty(isAttribute=false, localName = "RelatingConstraint")
	@Description("Reference to constraint that is being applied using this relationship.")
	@Required()
	@Guid("91c32615-7bc4-4259-9da4-6f840dd2e322")
	private com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint relatingConstraint;


	public IfcRelAssociatesConstraint()
	{
	}

	public IfcRelAssociatesConstraint(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect[] relatedObjects, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint relatingConstraint)
	{
		super(globalId, relatedObjects);
		this.relatingConstraint = relatingConstraint;
	}

	public String getIntent() {
		return this.intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint getRelatingConstraint() {
		return this.relatingConstraint;
	}

	public void setRelatingConstraint(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint relatingConstraint) {
		this.relatingConstraint = relatingConstraint;
	}


}

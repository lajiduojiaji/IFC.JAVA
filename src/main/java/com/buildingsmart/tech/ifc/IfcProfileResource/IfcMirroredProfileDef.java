// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcDerivedProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D;

@Guid("44ff2ba0-d8b9-466c-9dba-d297766c680f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMirroredProfileDef extends IfcDerivedProfileDef
{

	public IfcMirroredProfileDef()
	{
	}

	public IfcMirroredProfileDef(IfcProfileTypeEnum profileType, IfcProfileDef parentProfile, IfcCartesianTransformationOperator2D _operator)
	{
		super(profileType, parentProfile, _operator);
	}

	public IfcCartesianTransformationOperator2D getOperator() {
		return null;
	}


}


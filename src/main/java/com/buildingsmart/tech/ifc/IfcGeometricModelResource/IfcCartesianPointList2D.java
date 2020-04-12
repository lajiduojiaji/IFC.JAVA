// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("14ee71bc-ac06-4564-9ce3-0b8651e89195")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCartesianPointList2D extends IfcCartesianPointList
{
	@Description("Two-dimensional list of Cartesian points provided by two coordinates.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a3773106-857a-4020-a6b4-6b914b9fbac1")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "CoordList")
	private List<Double> coordList;


	public IfcCartesianPointList2D()
	{
	}

	public IfcCartesianPointList2D(Double[] coordList)
	{
		this.coordList = new ArrayList<>(Arrays.asList(coordList));
	}

	public List<Double> getCoordList() {
		return this.coordList;
	}


}


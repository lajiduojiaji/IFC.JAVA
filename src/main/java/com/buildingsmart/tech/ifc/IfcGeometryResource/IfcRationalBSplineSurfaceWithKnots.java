// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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

@Guid("fa4d0f85-ebcc-4a94-aa4d-e9876009463c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRationalBSplineSurfaceWithKnots extends IfcBSplineSurfaceWithKnots
{
	@Description("The weights associated with the control points in the rational case.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1140f72c-ae94-41b6-956b-58e9cb40cb9d")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "WeightsData")
	private List<Double> weightsData;


	public IfcRationalBSplineSurfaceWithKnots()
	{
	}

	public IfcRationalBSplineSurfaceWithKnots(int uDegree, int vDegree, IfcCartesianPoint[] controlPointsList, IfcBSplineSurfaceForm surfaceForm, Boolean uClosed, Boolean vClosed, Boolean selfIntersect, Integer[] uMultiplicities, Integer[] vMultiplicities, Double[] uKnots, Double[] vKnots, IfcKnotType knotSpec, Double[] weightsData)
	{
		super(uDegree, vDegree, controlPointsList, surfaceForm, uClosed, vClosed, selfIntersect, uMultiplicities, vMultiplicities, uKnots, vKnots, knotSpec);
		this.weightsData = new ArrayList<>(Arrays.asList(weightsData));
	}

	public List<Double> getWeightsData() {
		return this.weightsData;
	}

	public Double getWeights() {
		return 0.0;
	}


}


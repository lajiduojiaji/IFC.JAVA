// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d2c744de-ffd9-4239-a7cb-245b41b80a33")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIndexedPolygonalFaceWithVoids extends IfcIndexedPolygonalFace
{
	@JacksonXmlProperty(isAttribute=false, localName = "InnerCoordIndices")
	@Description("Two-dimensional list, where the first dimension represents each inner loop (from 1 to N) and the second dimension the indices to three or more points that define the vertices of each inner loop. If the tessellated face set is closed, indicated by <em>SELF\\IfcTessellatedFaceSet.Closed</em>, then the points, defining the inner loops, shall connect clockwise, as seen from the outside of the body.  <blockquote class=\"note\">NOTE&nbsp; The coordinates of the vertices are provided by the indexed list of <em>SELF\\IfcTessellatedFaceSet.Coordinates.CoordList</em>. If the  <em>SELF\\IfcTessellatedFaceSet.PnIndex</em> is provided, the indices point into it, otherwise directly into the <em>IfcCartesianPointList3D</em>.</blockquote>")
	@Required()
	@MinLength(1)
	@Guid("f6139048-1730-4c6e-91f6-239c4a5c0ca2")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger> innerCoordIndices = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger>();


	public IfcIndexedPolygonalFaceWithVoids()
	{
	}

	public IfcIndexedPolygonalFaceWithVoids(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger[] coordIndex, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger[] innerCoordIndices)
	{
		super(coordIndex);
		this.innerCoordIndices = new ArrayList<>(Arrays.asList(innerCoordIndices));
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger> getInnerCoordIndices() {
		return this.innerCoordIndices;
	}


}

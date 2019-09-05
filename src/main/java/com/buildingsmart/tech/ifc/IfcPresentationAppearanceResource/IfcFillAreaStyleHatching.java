// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f465f4fa-8a5f-4683-ad61-1fb517f09bc0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFillAreaStyleHatching extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcFillStyleSelect
{
	@JacksonXmlProperty(isAttribute=false, localName = "HatchLineAppearance")
	@Description("The curve style of the hatching lines. Any curve style pattern shall start at the origin of each hatch line.")
	@Required()
	@Guid("70a11e79-bdc8-46f0-9008-63a772af258e")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyle hatchLineAppearance;

	@Description("A repetition factor that determines the distance between adjacent hatch lines. The factor can either be defined by a parallel offset, or by a repeat factor provided by <em>IfcVector</em>.    <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The attribute type of <em>StartOfNextHatchLine</em> has changed to a SELECT of <em>IfcPositiveLengthMeasure</em> (new) and <em>IfcOneDirectionRepeatFactor</em>.</blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute type of <em>StartOfNextHatchLine</em> has changed to a SELECT of <em>IfcPositiveLengthMeasure</em> (new) and <em>IfcVector</em>.</blockquote>")
	@Required()
	@Guid("c710aa21-dea0-4d37-aee0-3842bade1db0")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcHatchLineDistanceSelect startOfNextHatchLine;

	@JacksonXmlProperty(isAttribute=false, localName = "PointOfReferenceHatchLine")
	@Description("A Cartesian point which defines the offset of the reference hatch line from the origin of the (virtual) hatching coordinate system. The origin is used for mapping the fill area style hatching onto an annotation fill area or surface. The reference hatch line would then appear with this offset from the fill style target point.<br>  If not given the reference hatch lines goes through the origin of the (virtual) hatching coordinate system.    <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The usage of the attribute <em>PointOfReferenceHatchLine</em> has changed to not provide the Cartesian point which is the origin for mapping, but to provide an offset to the origin for the mapping. The attribute has been made OPTIONAL.</blockquote>")
	@Guid("eec82600-9107-417b-a087-cf445a3c336d")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint pointOfReferenceHatchLine;

	@JacksonXmlProperty(isAttribute=false, localName = "PatternStart")
	@Description("A distance along the reference hatch line which is the start point for the curve style font pattern of the reference hatch line.<br>  If not given, the start point of the curve style font pattern is at the (virtual) hatching coordinate system.    <blockquote class=\"change-ifc2x2\">IFC2x2 Add2 CHANGE The attribute <em>PatternStart</em> has been made OPTIONAL.</blockquote>")
	@Guid("fba84c74-f390-4285-8b76-72a96b48b4aa")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint patternStart;

	@JacksonXmlProperty(isAttribute=true, localName = "HatchLineAngle")
	@Description("A plane angle measure determining the direction of the parallel hatching lines.")
	@Required()
	@Guid("3f4138c4-0acd-472b-9c06-98e72cd44193")
	private double hatchLineAngle;


	public IfcFillAreaStyleHatching()
	{
	}

	public IfcFillAreaStyleHatching(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyle hatchLineAppearance, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcHatchLineDistanceSelect startOfNextHatchLine, double hatchLineAngle)
	{
		this.hatchLineAppearance = hatchLineAppearance;
		this.startOfNextHatchLine = startOfNextHatchLine;
		this.hatchLineAngle = hatchLineAngle;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyle getHatchLineAppearance() {
		return this.hatchLineAppearance;
	}

	public void setHatchLineAppearance(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyle hatchLineAppearance) {
		this.hatchLineAppearance = hatchLineAppearance;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcHatchLineDistanceSelect getStartOfNextHatchLine() {
		return this.startOfNextHatchLine;
	}

	public void setStartOfNextHatchLine(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcHatchLineDistanceSelect startOfNextHatchLine) {
		this.startOfNextHatchLine = startOfNextHatchLine;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getPointOfReferenceHatchLine() {
		return this.pointOfReferenceHatchLine;
	}

	public void setPointOfReferenceHatchLine(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint pointOfReferenceHatchLine) {
		this.pointOfReferenceHatchLine = pointOfReferenceHatchLine;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getPatternStart() {
		return this.patternStart;
	}

	public void setPatternStart(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint patternStart) {
		this.patternStart = patternStart;
	}

	public double getHatchLineAngle() {
		return this.hatchLineAngle;
	}

	public void setHatchLineAngle(double hatchLineAngle) {
		this.hatchLineAngle = hatchLineAngle;
	}


}

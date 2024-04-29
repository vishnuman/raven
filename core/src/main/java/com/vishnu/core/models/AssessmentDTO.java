package com.vishnu.core.models;

import java.util.List;

public class AssessmentDTO {
    private String id;
    private String partnerId;
    private String status;
    private double assessmentScore;
    private String relatedReference;
    private AssessmentSpecificationDTO assessmentSpecification;
    private List<AssessmentItemDTO> assessments;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPartnerId() {
        return partnerId;
    }
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getAssessmentScore() {
        return assessmentScore;
    }
    public void setAssessmentScore(double assessmentScore) {
        this.assessmentScore = assessmentScore;
    }
    public String getRelatedReference() {
        return relatedReference;
    }
    public void setRelatedReference(String relatedReference) {
        this.relatedReference = relatedReference;
    }
    public AssessmentSpecificationDTO getAssessmentSpecification() {
        return assessmentSpecification;
    }
    public void setAssessmentSpecification(AssessmentSpecificationDTO assessmentSpecification) {
        this.assessmentSpecification = assessmentSpecification;
    }
    public List<AssessmentItemDTO> getAssessments() {
        return assessments;
    }
    public void setAssessments(List<AssessmentItemDTO> assessments) {
        this.assessments = assessments;
    }

    // Getters and setters...
}

class AssessmentSpecificationDTO {
    private String id;
    private String name;
    private String href;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHref() {
        return href;
    }
    public void setHref(String href) {
        this.href = href;
    }

    // Getters and setters...
}

class AssessmentItemDTO {
    private String assessmentType;
    private double overallScore;
    private String status;
    private String statusReason;
    private String statusChangeDate;
    private String completionDate;
    private String startDate;
    private List<RelatedPartyDTO> relatedParty;
    private List<CharacteristicDTO> characteristics;
    public String getAssessmentType() {
        return assessmentType;
    }
    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }
    public double getOverallScore() {
        return overallScore;
    }
    public void setOverallScore(double overallScore) {
        this.overallScore = overallScore;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatusReason() {
        return statusReason;
    }
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }
    public String getStatusChangeDate() {
        return statusChangeDate;
    }
    public void setStatusChangeDate(String statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }
    public String getCompletionDate() {
        return completionDate;
    }
    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public List<RelatedPartyDTO> getRelatedParty() {
        return relatedParty;
    }
    public void setRelatedParty(List<RelatedPartyDTO> relatedParty) {
        this.relatedParty = relatedParty;
    }
    public List<CharacteristicDTO> getCharacteristics() {
        return characteristics;
    }
    public void setCharacteristics(List<CharacteristicDTO> characteristics) {
        this.characteristics = characteristics;
    }

    // Getters and setters...
}

class RelatedPartyDTO {
    private String id;
    private String name;
    private String role;
    private String referredType;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getReferredType() {
        return referredType;
    }
    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }

    // Getters and setters...
}

class CharacteristicDTO {
    private String name;
    private String valueType;
    private double weightage;
    private String value;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
    public double getWeightage() {
        return weightage;
    }
    public void setWeightage(double weightage) {
        this.weightage = weightage;
    }
  

    // Getters and setters...
}

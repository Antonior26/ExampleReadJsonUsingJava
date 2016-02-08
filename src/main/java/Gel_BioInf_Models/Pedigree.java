/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Gel_BioInf_Models;  
@SuppressWarnings("all")
/** This is the concept of a family with associated phenotypes as present in the record RDParticipant */
@org.apache.avro.specific.AvroGenerated
public class Pedigree extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pedigree\",\"namespace\":\"Gel_BioInf_Models\",\"doc\":\"This is the concept of a family with associated phenotypes as present in the record RDParticipant\",\"fields\":[{\"name\":\"gelFamilyId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Family id which internally translate to a sample set\"},{\"name\":\"participants\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RDParticipant\",\"doc\":\"This defines a RD Participant (demographics and pedigree information)\",\"fields\":[{\"name\":\"pedigreeId\",\"type\":\"int\",\"doc\":\"Numbering used to refer to each member of the pedigree\"},{\"name\":\"isProband\",\"type\":\"boolean\",\"doc\":\"If this field is true, the member should be consider the proband of this family\"},{\"name\":\"gelId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"gel internal identifier, only required when the participant belongs to the program\"},{\"name\":\"gelFamilyId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Family id which internally translate to a sample set\"},{\"name\":\"sex\",\"type\":{\"type\":\"enum\",\"name\":\"Sex\",\"doc\":\"Sex\",\"symbols\":[\"male\",\"female\",\"undetermined\"]},\"doc\":\"Sex of the Participant\"},{\"name\":\"fatherId\",\"type\":[\"null\",\"int\"],\"doc\":\"refers to the pedigreeId of the father\\n    Id of the parent, if unknown then no parent is referenced. Parents may need to be entered even if no data is known\\n    about them in order to unambiguously reconstruct the pedigree.\"},{\"name\":\"motherId\",\"type\":[\"null\",\"int\"],\"doc\":\"refers to the pedigreeId of the mother\\n    Id of the parent, if unknown then no parent is referenced. Parents may need to be entered even if no data is known\\n    about them in order to unambiguously reconstruct the pedigree.\"},{\"name\":\"twinGroup\",\"type\":[\"null\",\"int\"],\"doc\":\"Each twin group is numbered, i.e. all members of a group of multiparous births receive the same number\"},{\"name\":\"monozygotic\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TernaryOption\",\"doc\":\"This the define a yes/no/unknown case\",\"symbols\":[\"yes\",\"no\",\"unknown\"]}],\"doc\":\"A property of the twinning group but should be entered for all members\"},{\"name\":\"adoptedStatus\",\"type\":{\"type\":\"enum\",\"name\":\"AdoptedStatus\",\"doc\":\"adoptedin means adopted into the family\\nadoptedout means child belonged to the family and was adopted out\",\"symbols\":[\"not_adopted\",\"adoptedin\",\"adoptedout\"]},\"doc\":\"Adopted Status\"},{\"name\":\"lifeStatus\",\"type\":{\"type\":\"enum\",\"name\":\"LifeStatus\",\"doc\":\"Life Status\",\"symbols\":[\"alive\",\"aborted\",\"deceased\",\"unborn\",\"stillborn\",\"miscarriage\"]},\"doc\":\"Life Status\"},{\"name\":\"consanguineousParents\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The parents of this participant has a consanguineous relationship\"},{\"name\":\"consanguineousPopulation\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Offspring from a consanguineous population\"},{\"name\":\"affectionStatus\",\"type\":{\"type\":\"enum\",\"name\":\"AffectionStatus\",\"doc\":\"Affection Status\",\"symbols\":[\"unaffected\",\"affected\",\"unknown\"]},\"doc\":\"Affection Status\"},{\"name\":\"disorderList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Disorder\",\"doc\":\"This is quite GEL specific. This is the way is stored in ModelCatalogue and PanelApp.\\nCurrently all specific disease titles are assigned to a disease subgroup so really only specificDisease needs to be\\ncompleted but we add the others for generality\",\"fields\":[{\"name\":\"diseaseGroup\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level2 Title for this disorder\"},{\"name\":\"diseaseSubGroup\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level3 Title for this disorder\"},{\"name\":\"specificDisease\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level4 Title for this disorder\"},{\"name\":\"ageOfOnset\",\"type\":[\"null\",\"int\"],\"doc\":\"Age of onset in months\"}]}},\"doc\":\"Clinical Data (disorders). If the family member is unaffected as per affectionStatus then this list is empty\"},{\"name\":\"hpoTermList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"HpoTerm\",\"doc\":\"This defines an HPO term and its modifiers (possibly multiple)\\nIf HPO term presence is unknown we don't have a entry on the list\",\"fields\":[{\"name\":\"term\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Identifier of the HPO term\"},{\"name\":\"termPresence\",\"type\":\"boolean\",\"doc\":\"This is whether the term is present in the participant (default is null=unkown) true=term is present in participant,\\n    false=term is not present\"},{\"name\":\"modifiers\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"doc\":\"Modifier associated with the HPO term\"},{\"name\":\"ageOfOnset\",\"type\":[\"null\",\"int\"],\"doc\":\"Age of onset in months\"}]}},\"doc\":\"Clinical Data (HPO terms)\"},{\"name\":\"ancestries\",\"type\":{\"type\":\"record\",\"name\":\"Ancestries\",\"fields\":[{\"name\":\"mothersEthnicOrigin\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"EthnicCategory\",\"doc\":\"This is the list of ethnics in ONS16\\n\\n* `D`:  Mixed: White and Black Caribbean\\n* `E`:  Mixed: White and Black African\\n* `F`:  Mixed: White and Asian\\n* `G`:  Mixed: Any other mixed background\\n* `A`:  White: British\\n* `B`:  White: Irish\\n* `C`:  White: Any other White background\\n* `L`:  Asian or Asian British: Any other Asian background\\n* `M`:  Black or Black British: Caribbean\\n* `N`:  Black or Black British: African\\n* `H`:  Asian or Asian British: Indian\\n* `J`:  Asian or Asian British: Pakistani\\n* `K`:  Asian or Asian British: Bangladeshi\\n* `P`:  Black or Black British: Any other Black background\\n* `S`:  Other Ethnic Groups: Any other ethnic group\\n* `R`:  Other Ethnic Groups: Chinese\\n* `Z`:  Not stated\",\"symbols\":[\"D\",\"E\",\"F\",\"G\",\"A\",\"B\",\"C\",\"L\",\"M\",\"N\",\"H\",\"J\",\"K\",\"P\",\"S\",\"R\",\"Z\"]}],\"doc\":\"Mother's Ethnic Origin\"},{\"name\":\"mothersOtherRelevantAncestry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Mother's Ethnic Origin Description\"},{\"name\":\"fathersEthnicOrigin\",\"type\":[\"null\",\"EthnicCategory\"],\"doc\":\"Father's Ethnic Origin\"},{\"name\":\"fathersOtherRelevantAncestry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Father's Ethnic Origin Description\"},{\"name\":\"chiSquare1KGenomesPhase3Pop\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ChiSquare1KGenomesPhase3Pop\",\"doc\":\"Chi-square test for goodness of fit of this sample to 1000 Genomes Phase 3 populations\",\"fields\":[{\"name\":\"kGSuperPopCategory\",\"type\":{\"type\":\"enum\",\"name\":\"KGSuperPopCategory\",\"doc\":\"1K Population\",\"symbols\":[\"AFR\",\"AMR\",\"EAS\",\"EUR\",\"SAS\"]},\"doc\":\"1K Super Population\"},{\"name\":\"kGPopCategory\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"KGPopCategory\",\"doc\":\"1K Super Population\",\"symbols\":[\"ACB\",\"ASW\",\"BEB\",\"CDX\",\"CEU\",\"CHB\",\"CHS\",\"CLM\",\"ESN\",\"FIN\",\"GBR\",\"GIH\",\"GWD\",\"IBS\",\"ITU\",\"JPT\",\"KHV\",\"LWK\",\"MSL\",\"MXL\",\"PEL\",\"PJL\",\"PUR\",\"STU\",\"TSI\",\"YRI\"]}],\"doc\":\"1K Population\"},{\"name\":\"chiSquare\",\"type\":\"float\",\"doc\":\"Chi-square test for goodness of fit of this sample to this 1000 Genomes Phase 3 population\"}]}}],\"doc\":\"Chi-square test for goodness of fit of this sample to 1000 Genomes Phase 3 populations\"}]},\"doc\":\"Participant's ancestries, defined as Mother's/Father's Ethnic Origin and Chi-square test for goodness of fit of this sample to 1000 Genomes Phase 3 populations\"},{\"name\":\"dataModelCatalogueVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Version of the Data Catalogue against which the information is being provided\\n    The data catalogue version should internally keep track of the version for the HPO ontology\",\"default\":\"v4.2\"},{\"name\":\"consentStatus\",\"type\":{\"type\":\"record\",\"name\":\"ConsentStatus\",\"doc\":\"Consent Status\",\"fields\":[{\"name\":\"programmeConsent\",\"type\":\"boolean\",\"doc\":\"Is this individual consented to the programme?\\n    It could simple be a family member that is not consented but for whom affection status is known\",\"default\":false},{\"name\":\"primaryFindingConsent\",\"type\":\"boolean\",\"doc\":\"Consent for feedback of primary findings?\",\"default\":false},{\"name\":\"secondaryFindingConsent\",\"type\":\"boolean\",\"doc\":\"Consent for secondary finding lookup\",\"default\":false},{\"name\":\"carrierStatu","sConsent\",\"type\":\"boolean\",\"doc\":\"Consent for carrier status check?\",\"default\":false}]},\"doc\":\"What has this participant consented to?\\n    A participant that has been consented to the programme should also have sequence data associated with them; however\\n    this needs to be programmatically checked\"},{\"name\":\"samples\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"doc\":\"This is an array containing all the samples that belong to this individual, e.g [\\\"LP00002255_GA4\\\"]\"},{\"name\":\"additionalInformation\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"doc\":\"We could add a map here to store additional information for example URIs to images, ECGs, etc\\n    Null by default\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Family id which internally translate to a sample set */
   public java.lang.String gelFamilyId;
   public java.util.List<Gel_BioInf_Models.RDParticipant> participants;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Pedigree() {}

  /**
   * All-args constructor.
   */
  public Pedigree(java.lang.String gelFamilyId, java.util.List<Gel_BioInf_Models.RDParticipant> participants) {
    this.gelFamilyId = gelFamilyId;
    this.participants = participants;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return gelFamilyId;
    case 1: return participants;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: gelFamilyId = (java.lang.String)value$; break;
    case 1: participants = (java.util.List<Gel_BioInf_Models.RDParticipant>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'gelFamilyId' field.
   * Family id which internally translate to a sample set   */
  public java.lang.String getGelFamilyId() {
    return gelFamilyId;
  }

  /**
   * Sets the value of the 'gelFamilyId' field.
   * Family id which internally translate to a sample set   * @param value the value to set.
   */
  public void setGelFamilyId(java.lang.String value) {
    this.gelFamilyId = value;
  }

  /**
   * Gets the value of the 'participants' field.
   */
  public java.util.List<Gel_BioInf_Models.RDParticipant> getParticipants() {
    return participants;
  }

  /**
   * Sets the value of the 'participants' field.
   * @param value the value to set.
   */
  public void setParticipants(java.util.List<Gel_BioInf_Models.RDParticipant> value) {
    this.participants = value;
  }

  /** Creates a new Pedigree RecordBuilder */
  public static Gel_BioInf_Models.Pedigree.Builder newBuilder() {
    return new Gel_BioInf_Models.Pedigree.Builder();
  }
  
  /** Creates a new Pedigree RecordBuilder by copying an existing Builder */
  public static Gel_BioInf_Models.Pedigree.Builder newBuilder(Gel_BioInf_Models.Pedigree.Builder other) {
    return new Gel_BioInf_Models.Pedigree.Builder(other);
  }
  
  /** Creates a new Pedigree RecordBuilder by copying an existing Pedigree instance */
  public static Gel_BioInf_Models.Pedigree.Builder newBuilder(Gel_BioInf_Models.Pedigree other) {
    return new Gel_BioInf_Models.Pedigree.Builder(other);
  }
  
  /**
   * RecordBuilder for Pedigree instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pedigree>
    implements org.apache.avro.data.RecordBuilder<Pedigree> {

    private java.lang.String gelFamilyId;
    private java.util.List<Gel_BioInf_Models.RDParticipant> participants;

    /** Creates a new Builder */
    private Builder() {
      super(Gel_BioInf_Models.Pedigree.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Gel_BioInf_Models.Pedigree.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.gelFamilyId)) {
        this.gelFamilyId = data().deepCopy(fields()[0].schema(), other.gelFamilyId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.participants)) {
        this.participants = data().deepCopy(fields()[1].schema(), other.participants);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Pedigree instance */
    private Builder(Gel_BioInf_Models.Pedigree other) {
            super(Gel_BioInf_Models.Pedigree.SCHEMA$);
      if (isValidValue(fields()[0], other.gelFamilyId)) {
        this.gelFamilyId = data().deepCopy(fields()[0].schema(), other.gelFamilyId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.participants)) {
        this.participants = data().deepCopy(fields()[1].schema(), other.participants);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'gelFamilyId' field */
    public java.lang.String getGelFamilyId() {
      return gelFamilyId;
    }
    
    /** Sets the value of the 'gelFamilyId' field */
    public Gel_BioInf_Models.Pedigree.Builder setGelFamilyId(java.lang.String value) {
      validate(fields()[0], value);
      this.gelFamilyId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'gelFamilyId' field has been set */
    public boolean hasGelFamilyId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'gelFamilyId' field */
    public Gel_BioInf_Models.Pedigree.Builder clearGelFamilyId() {
      gelFamilyId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'participants' field */
    public java.util.List<Gel_BioInf_Models.RDParticipant> getParticipants() {
      return participants;
    }
    
    /** Sets the value of the 'participants' field */
    public Gel_BioInf_Models.Pedigree.Builder setParticipants(java.util.List<Gel_BioInf_Models.RDParticipant> value) {
      validate(fields()[1], value);
      this.participants = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'participants' field has been set */
    public boolean hasParticipants() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'participants' field */
    public Gel_BioInf_Models.Pedigree.Builder clearParticipants() {
      participants = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Pedigree build() {
      try {
        Pedigree record = new Pedigree();
        record.gelFamilyId = fieldSetFlags()[0] ? this.gelFamilyId : (java.lang.String) defaultValue(fields()[0]);
        record.participants = fieldSetFlags()[1] ? this.participants : (java.util.List<Gel_BioInf_Models.RDParticipant>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
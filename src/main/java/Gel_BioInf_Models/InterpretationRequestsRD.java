/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Gel_BioInf_Models;

@SuppressWarnings("all")
/** This protocol defines the mechanism that GEL uses to trigger a clinical interpretation process from a third party
The record Report is the top level class. This includes clinical information + various version
The annotation provided by Genomics England is created using CellBase https://github.com/opencb/cellbase/wiki
All annotations are against Ensembl gene models */
@org.apache.avro.specific.AvroGenerated
public interface InterpretationRequestsRD {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"InterpretationRequestsRD\",\"namespace\":\"Gel_BioInf_Models\",\"doc\":\"This protocol defines the mechanism that GEL uses to trigger a clinical interpretation process from a third party\\nThe record Report is the top level class. This includes clinical information + various version\\nThe annotation provided by Genomics England is created using CellBase https://github.com/opencb/cellbase/wiki\\nAll annotations are against Ensembl gene models\",\"types\":[{\"type\":\"enum\",\"name\":\"Sex\",\"doc\":\"Sex\",\"symbols\":[\"male\",\"female\",\"undetermined\"]},{\"type\":\"enum\",\"name\":\"TernaryOption\",\"doc\":\"This the define a yes/no/unknown case\",\"symbols\":[\"yes\",\"no\",\"unknown\"]},{\"type\":\"enum\",\"name\":\"EthnicCategory\",\"doc\":\"This is the list of ethnics in ONS16\\n\\n* `D`:  Mixed: White and Black Caribbean\\n* `E`:  Mixed: White and Black African\\n* `F`:  Mixed: White and Asian\\n* `G`:  Mixed: Any other mixed background\\n* `A`:  White: British\\n* `B`:  White: Irish\\n* `C`:  White: Any other White background\\n* `L`:  Asian or Asian British: Any other Asian background\\n* `M`:  Black or Black British: Caribbean\\n* `N`:  Black or Black British: African\\n* `H`:  Asian or Asian British: Indian\\n* `J`:  Asian or Asian British: Pakistani\\n* `K`:  Asian or Asian British: Bangladeshi\\n* `P`:  Black or Black British: Any other Black background\\n* `S`:  Other Ethnic Groups: Any other ethnic group\\n* `R`:  Other Ethnic Groups: Chinese\\n* `Z`:  Not stated\",\"symbols\":[\"D\",\"E\",\"F\",\"G\",\"A\",\"B\",\"C\",\"L\",\"M\",\"N\",\"H\",\"J\",\"K\",\"P\",\"S\",\"R\",\"Z\"]},{\"type\":\"enum\",\"name\":\"KGPopCategory\",\"doc\":\"1K Super Population\",\"symbols\":[\"ACB\",\"ASW\",\"BEB\",\"CDX\",\"CEU\",\"CHB\",\"CHS\",\"CLM\",\"ESN\",\"FIN\",\"GBR\",\"GIH\",\"GWD\",\"IBS\",\"ITU\",\"JPT\",\"KHV\",\"LWK\",\"MSL\",\"MXL\",\"PEL\",\"PJL\",\"PUR\",\"STU\",\"TSI\",\"YRI\"]},{\"type\":\"enum\",\"name\":\"KGSuperPopCategory\",\"doc\":\"1K Population\",\"symbols\":[\"AFR\",\"AMR\",\"EAS\",\"EUR\",\"SAS\"]},{\"type\":\"record\",\"name\":\"ChiSquare1KGenomesPhase3Pop\",\"doc\":\"Chi-square test for goodness of fit of this sample to 1000 Genomes Phase 3 populations\",\"fields\":[{\"name\":\"kGSuperPopCategory\",\"type\":\"KGSuperPopCategory\",\"doc\":\"1K Super Population\"},{\"name\":\"kGPopCategory\",\"type\":[\"null\",\"KGPopCategory\"],\"doc\":\"1K Population\"},{\"name\":\"chiSquare\",\"type\":\"float\",\"doc\":\"Chi-square test for goodness of fit of this sample to this 1000 Genomes Phase 3 population\"}]},{\"type\":\"record\",\"name\":\"Ancestries\",\"fields\":[{\"name\":\"mothersEthnicOrigin\",\"type\":[\"null\",\"EthnicCategory\"],\"doc\":\"Mother's Ethnic Origin\"},{\"name\":\"mothersOtherRelevantAncestry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Mother's Ethnic Origin Description\"},{\"name\":\"fathersEthnicOrigin\",\"type\":[\"null\",\"EthnicCategory\"],\"doc\":\"Father's Ethnic Origin\"},{\"name\":\"fathersOtherRelevantAncestry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Father's Ethnic Origin Description\"},{\"name\":\"chiSquare1KGenomesPhase3Pop\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"ChiSquare1KGenomesPhase3Pop\"}],\"doc\":\"Chi-square test for goodness of fit of this sample to 1000 Genomes Phase 3 populations\"}]},{\"type\":\"record\",\"name\":\"ConsentStatus\",\"doc\":\"Consent Status\",\"fields\":[{\"name\":\"programmeConsent\",\"type\":\"boolean\",\"doc\":\"Is this individual consented to the programme?\\n    It could simple be a family member that is not consented but for whom affection status is known\",\"default\":false},{\"name\":\"primaryFindingConsent\",\"type\":\"boolean\",\"doc\":\"Consent for feedback of primary findings?\",\"default\":false},{\"name\":\"secondaryFindingConsent\",\"type\":\"boolean\",\"doc\":\"Consent for secondary finding lookup\",\"default\":false},{\"name\":\"carrierStatusConsent\",\"type\":\"boolean\",\"doc\":\"Consent for carrier status check?\",\"default\":false}]},{\"type\":\"record\",\"name\":\"Disorder\",\"doc\":\"This is quite GEL specific. This is the way is stored in ModelCatalogue and PanelApp.\\nCurrently all specific disease titles are assigned to a disease subgroup so really only specificDisease needs to be\\ncompleted but we add the others for generality\",\"fields\":[{\"name\":\"diseaseGroup\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level2 Title for this disorder\"},{\"name\":\"diseaseSubGroup\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level3 Title for this disorder\"},{\"name\":\"specificDisease\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level4 Title for this disorder\"},{\"name\":\"ageOfOnset\",\"type\":[\"null\",\"int\"],\"doc\":\"Age of onset in months\"}]},{\"type\":\"record\",\"name\":\"HpoTerm\",\"doc\":\"This defines an HPO term and its modifiers (possibly multiple)\\nIf HPO term presence is unknown we don't have a entry on the list\",\"fields\":[{\"name\":\"term\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Identifier of the HPO term\"},{\"name\":\"termPresence\",\"type\":\"boolean\",\"doc\":\"This is whether the term is present in the participant (default is null=unkown) true=term is present in participant,\\n    false=term is not present\"},{\"name\":\"modifiers\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"doc\":\"Modifier associated with the HPO term\"},{\"name\":\"ageOfOnset\",\"type\":[\"null\",\"int\"],\"doc\":\"Age of onset in months\"}]},{\"type\":\"enum\",\"name\":\"AffectionStatus\",\"doc\":\"Affection Status\",\"symbols\":[\"unaffected\",\"affected\",\"unknown\"]},{\"type\":\"enum\",\"name\":\"LifeStatus\",\"doc\":\"Life Status\",\"symbols\":[\"alive\",\"aborted\",\"deceased\",\"unborn\",\"stillborn\",\"miscarriage\"]},{\"type\":\"enum\",\"name\":\"AdoptedStatus\",\"doc\":\"adoptedin means adopted into the family\\nadoptedout means child belonged to the family and was adopted out\",\"symbols\":[\"not_adopted\",\"adoptedin\",\"adoptedout\"]},{\"type\":\"record\",\"name\":\"RDParticipant\",\"doc\":\"This defines a RD Participant (demographics and pedigree information)\",\"fields\":[{\"name\":\"pedigreeId\",\"type\":\"int\",\"doc\":\"Numbering used to refer to each member of the pedigree\"},{\"name\":\"isProband\",\"type\":\"boolean\",\"doc\":\"If this field is true, the member should be consider the proband of this family\"},{\"name\":\"gelId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"gel internal identifier, only required when the participant belongs to the program\"},{\"name\":\"gelFamilyId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Family id which internally translate to a sample set\"},{\"name\":\"sex\",\"type\":\"Sex\",\"doc\":\"Sex of the Participant\"},{\"name\":\"fatherId\",\"type\":[\"null\",\"int\"],\"doc\":\"refers to the pedigreeId of the father\\n    Id of the parent, if unknown then no parent is referenced. Parents may need to be entered even if no data is known\\n    about them in order to unambiguously reconstruct the pedigree.\"},{\"name\":\"motherId\",\"type\":[\"null\",\"int\"],\"doc\":\"refers to the pedigreeId of the mother\\n    Id of the parent, if unknown then no parent is referenced. Parents may need to be entered even if no data is known\\n    about them in order to unambiguously reconstruct the pedigree.\"},{\"name\":\"twinGroup\",\"type\":[\"null\",\"int\"],\"doc\":\"Each twin group is numbered, i.e. all members of a group of multiparous births receive the same number\"},{\"name\":\"monozygotic\",\"type\":[\"null\",\"TernaryOption\"],\"doc\":\"A property of the twinning group but should be entered for all members\"},{\"name\":\"adoptedStatus\",\"type\":\"AdoptedStatus\",\"doc\":\"Adopted Status\"},{\"name\":\"lifeStatus\",\"type\":\"LifeStatus\",\"doc\":\"Life Status\"},{\"name\":\"consanguineousParents\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The parents of this participant has a consanguineous relationship\"},{\"name\":\"consanguineousPopulation\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Offspring from a consanguineous population\"},{\"name\":\"affectionStatus\",\"type\":\"AffectionStatus\",\"doc\":\"Affection Status\"},{\"name\":\"disorderList\",\"type\":{\"type\":\"array\",\"items\":\"Disorder\"},\"doc\":\"Clinical Data (disorders). If the family member is unaffected as per affectionStatus then this list is empty\"},{\"name\":\"hpoTermList\",\"type\":{\"type\":\"array\",\"items\":\"HpoTerm\"},\"doc\":\"Clinical Data (HPO terms)\"},{\"name\":\"ancestries\",\"type\":\"Ancestries\",\"doc\":\"Participant's ancestries, defined as Mother's/Father's Ethnic Origin and Chi-square test for goodness of fit of this sample ","to 1000 Genomes Phase 3 populations\"},{\"name\":\"dataModelCatalogueVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Version of the Data Catalogue against which the information is being provided\\n    The data catalogue version should internally keep track of the version for the HPO ontology\",\"default\":\"v4.2\"},{\"name\":\"consentStatus\",\"type\":\"ConsentStatus\",\"doc\":\"What has this participant consented to?\\n    A participant that has been consented to the programme should also have sequence data associated with them; however\\n    this needs to be programmatically checked\"},{\"name\":\"samples\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"doc\":\"This is an array containing all the samples that belong to this individual, e.g [\\\"LP00002255_GA4\\\"]\"},{\"name\":\"additionalInformation\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"doc\":\"We could add a map here to store additional information for example URIs to images, ECGs, etc\\n    Null by default\"}]},{\"type\":\"record\",\"name\":\"Pedigree\",\"doc\":\"This is the concept of a family with associated phenotypes as present in the record RDParticipant\",\"fields\":[{\"name\":\"gelFamilyId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Family id which internally translate to a sample set\"},{\"name\":\"participants\",\"type\":{\"type\":\"array\",\"items\":\"RDParticipant\"}}]},{\"type\":\"record\",\"name\":\"File\",\"doc\":\"This defines a file\\nThis Record is defined by the sampleID and a URI\\nCurrently SampleID can be a single String or an array of strings if multiple samples are associated with the same file\",\"fields\":[{\"name\":\"SampleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"doc\":\"Unique ID(s) of the Sample, for example in a multisample vcf this would have an array of all the smaple ids\"},{\"name\":\"URIFile\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"URI PATH\"}]},{\"type\":\"record\",\"name\":\"VirtualPanel\",\"doc\":\"This record defines a gene panel.\",\"fields\":[{\"name\":\"specificDiseaseTitle\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Name of the Specific Disease\"},{\"name\":\"panelVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Version of the Gene Panel\"},{\"name\":\"ensemblVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Ensembl version used to get teh genes or transcripts\"},{\"name\":\"dataModelCatalogueVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Version of the Data Catalogue against which the information is being provided\\n    The data catalogue version should internally keep track of the version for the HPO ontology\"},{\"name\":\"geneIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"gene id from ensembl (version as per annotation file)\"},{\"name\":\"Transcripts\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"doc\":\"transcript ids from ensembl\"},{\"name\":\"relevantRegions\",\"type\":[\"null\",\"File\"],\"doc\":\"BED format file\"},{\"name\":\"clinicalRelevantVariants\",\"type\":[\"null\",\"File\"],\"doc\":\"VCF File\"}]},{\"type\":\"record\",\"name\":\"OtherFamilyHistory\",\"doc\":\"Family history for secondary findings\\nArrays of strings describing discrete family history phenotypes\",\"fields\":[{\"name\":\"maternalFamilyHistory\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"doc\":\"Relevant Maternal family history\"},{\"name\":\"paternalFamilyHistory\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"doc\":\"Relevant Maternal family history\"}]},{\"type\":\"enum\",\"name\":\"ModeOfInheritance\",\"doc\":\"An enumeration for the different mode of inheritances:\\n\\n* `monoallelic_not_imprinted`: MONOALLELIC, autosomal or pseudoautosomal, not imprinted\\n* `monoallelic_maternally_imprinted`: MONOALLELIC, autosomal or pseudoautosomal, maternally imprinted (paternal allele expressed)\\n* `monoallelic_paternally_imprinted`: MONOALLELIC, autosomal or pseudoautosomal, paternally imprinted (maternal allele expressed)\\n* `monoallelic`: MONOALLELIC, autosomal or pseudoautosomal, imprinted status unknown\\n* `biallelic`: BIALLELIC, autosomal or pseudoautosomal\\n* `monoallelic_and_biallelic`: BOTH monoallelic and biallelic, autosomal or pseudoautosomal\\n* `monoallelic_and_more_severe_biallelic`: BOTH monoallelic and biallelic, autosomal or pseudoautosomal (but BIALLELIC mutations cause a more SEVERE disease form), autosomal or pseudoautosomal\\n* `xlinked_biallelic`: X-LINKED: hemizygous mutation in males, biallelic mutations in females\\n* `xlinked_monoallelic`: X linked: hemizygous mutation in males, monoallelic mutations in females may cause disease (may be less severe, later onset than males)\\n* `mitochondrial`: MITOCHONDRIAL\\n* `unknown`: Unknown\",\"symbols\":[\"monoallelic\",\"monoallelic_not_imprinted\",\"monoallelic_maternally_imprinted\",\"monoallelic_paternally_imprinted\",\"biallelic\",\"monoallelic_and_biallelic\",\"monoallelic_and_more_severe_biallelic\",\"xlinked_biallelic\",\"xlinked_monoallelic\",\"mitochondrial\",\"unknown\"]},{\"type\":\"enum\",\"name\":\"ComplexGeneticPhenomena\",\"symbols\":[\"mosaicism\",\"monosomy\",\"disomy\",\"uniparental_disomy\",\"trisomy\",\"other_aneuploidy\"]},{\"type\":\"record\",\"name\":\"InterpretationRequestRD\",\"doc\":\"This record represents basic information for this report\",\"fields\":[{\"name\":\"InterpretationRequestID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Unique id for this report\"},{\"name\":\"genomeAssemblyVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"This is the version of the assembly used to align the reads\",\"default\":\"GRCh37.p13\"},{\"name\":\"InterpretationRequestVersion\",\"type\":\"int\",\"doc\":\"Version of this request\"},{\"name\":\"interpretGenome\",\"type\":\"boolean\",\"doc\":\"Load data to system or also provide interpretation?\",\"default\":false},{\"name\":\"workspace\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"The genome shall be assigned to the workspaces(projects or domains with a predefined set of users) to control user access\"},{\"name\":\"BAMs\",\"type\":{\"type\":\"array\",\"items\":\"File\"},\"doc\":\"BAMs Files\"},{\"name\":\"gVCFs\",\"type\":{\"type\":\"array\",\"items\":\"File\"},\"doc\":\"gVCFs Files where SNVs and INDELs are represented\"},{\"name\":\"VCFs\",\"type\":{\"type\":\"array\",\"items\":\"File\"},\"doc\":\"VCFs Files where SVs and CNVs are represented\"},{\"name\":\"bigWigs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"File\"}],\"doc\":\"BigWig Files\"},{\"name\":\"pedigreeDiagram\",\"type\":[\"null\",\"File\"],\"doc\":\"Pedigree Diagram Files\"},{\"name\":\"annotationFile\",\"type\":[\"null\",\"File\"],\"doc\":\"Variant Annotation using cellbase\"},{\"name\":\"pedigree\",\"type\":\"Pedigree\",\"doc\":\"Pedigree of the family to analyze\"},{\"name\":\"inbreedingCoefficientEstimates\",\"type\":[\"null\",\"File\"],\"doc\":\"File containing the Inbreeding Coefficient Estimation\"},{\"name\":\"complexGeneticPhenomena\",\"type\":[\"null\",\"ComplexGeneticPhenomena\"],\"doc\":\"Complex Genetic Phenomena\"},{\"name\":\"modeOfInheritance\",\"type\":\"ModeOfInheritance\",\"doc\":\"Mode of inheritance to analyze the family\"},{\"name\":\"virtualPanel\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"VirtualPanel\"}],\"doc\":\"Virtual Panels can be defined using EnsmbleIds, Transcripts, a BED File or a VCF File\"},{\"name\":\"otherFamilyHistory\",\"type\":[\"null\",\"OtherFamilyHistory\"],\"doc\":\"This is the family history as pertinent to assessing secondary findings.\\n    It is paternal or maternal with reference to the proband.\"},{\"name\":\"analysisReturnURI\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"name of the directory or endpoint where the analysed genome will be returned.\"},{\"name\":\"analysisVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"In the event that the provider has multiple versions of their system and an analysis will need to be provided against\\n    a particular version, then that version goes here.\",\"default\":\"1\"},{\"name\":\"additionalInfo\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"doc\":\"Additional information\"}]}],\"messages\"",":{}}");

  @SuppressWarnings("all")
  /** This protocol defines the mechanism that GEL uses to trigger a clinical interpretation process from a third party
The record Report is the top level class. This includes clinical information + various version
The annotation provided by Genomics England is created using CellBase https://github.com/opencb/cellbase/wiki
All annotations are against Ensembl gene models */
  public interface Callback extends InterpretationRequestsRD {
    public static final org.apache.avro.Protocol PROTOCOL = Gel_BioInf_Models.InterpretationRequestsRD.PROTOCOL;
  }
}
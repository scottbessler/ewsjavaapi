/**************************************************************************
 * copyright file="ContactSchema.java" company="Microsoft"
 *     Copyright (c) Microsoft Corporation.  All rights reserved.
 * 
 * Defines the ContactSchema.java.
 **************************************************************************/
package microsoft.exchange.webservices.data;

import java.util.EnumSet;

/***
 * Represents the schema for contacts.
 */
@Schema
public class ContactSchema extends ItemSchema {

	/***
	 * FieldURIs for contacts.
	 */
	private static interface FieldUris {

		/** The File as. */
		String FileAs = "contacts:FileAs";

		/** The File as mapping. */
		String FileAsMapping = "contacts:FileAsMapping";

		/** The Display name. */
		String DisplayName = "contacts:DisplayName";

		/** The Given name. */
		String GivenName = "contacts:GivenName";

		/** The Initials. */
		String Initials = "contacts:Initials";

		/** The Middle name. */
		String MiddleName = "contacts:MiddleName";

		/** The Nick name. */
		String NickName = "contacts:Nickname";

		/** The Complete name. */
		String CompleteName = "contacts:CompleteName";

		/** The Company name. */
		String CompanyName = "contacts:CompanyName";

		/** The Email address. */
		String EmailAddress = "contacts:EmailAddress";

		/** The Email addresses. */
		String EmailAddresses = "contacts:EmailAddresses";

		/** The Physical addresses. */
		String PhysicalAddresses = "contacts:PhysicalAddresses";

		/** The Phone number. */
		String PhoneNumber = "contacts:PhoneNumber";

		/** The Phone numbers. */
		String PhoneNumbers = "contacts:PhoneNumbers";

		/** The Assistant name. */
		String AssistantName = "contacts:AssistantName";

		/** The Birthday. */
		String Birthday = "contacts:Birthday";

		/** The Business home page. */
		String BusinessHomePage = "contacts:BusinessHomePage";

		/** The Children. */
		String Children = "contacts:Children";

		/** The Companies. */
		String Companies = "contacts:Companies";

		/** The Contact source. */
		String ContactSource = "contacts:ContactSource";

		/** The Department. */
		String Department = "contacts:Department";

		/** The Generation. */
		String Generation = "contacts:Generation";

		/** The Im address. */
		String ImAddress = "contacts:ImAddress";

		/** The Im addresses. */
		String ImAddresses = "contacts:ImAddresses";

		/** The Job title. */
		String JobTitle = "contacts:JobTitle";

		/** The Manager. */
		String Manager = "contacts:Manager";

		/** The Mileage. */
		String Mileage = "contacts:Mileage";

		/** The Office location. */
		String OfficeLocation = "contacts:OfficeLocation";

		/** The Physical address city. */
		String PhysicalAddressCity = "contacts:PhysicalAddress:City";

		/** The Physical address country or region. */
		String PhysicalAddressCountryOrRegion =
				"contacts:PhysicalAddress:CountryOrRegion";

		/** The Physical address state. */
		String PhysicalAddressState = "contacts:PhysicalAddress:State";

		/** The Physical address street. */
		String PhysicalAddressStreet = "contacts:PhysicalAddress:Street";

		/** The Physical address postal code. */
		String PhysicalAddressPostalCode =
				"contacts:PhysicalAddress:PostalCode";

		/** The Postal address index. */
		String PostalAddressIndex = "contacts:PostalAddressIndex";

		/** The Profession. */
		String Profession = "contacts:Profession";

		/** The Spouse name. */
		String SpouseName = "contacts:SpouseName";

		/** The Surname. */
		String Surname = "contacts:Surname";

		/** The Wedding anniversary. */
		String WeddingAnniversary = "contacts:WeddingAnniversary";

		/** The Has picture. */
		String HasPicture = "contacts:HasPicture";
	}

	/***
	 * Defines the FileAs property.
	 */
	public static final PropertyDefinition FileAs =
			new StringPropertyDefinition(
					XmlElementNames.FileAs, FieldUris.FileAs, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the FileAsMapping property.
	 */
	public static final PropertyDefinition FileAsMapping =
			new GenericPropertyDefinition<FileAsMapping>(
					FileAsMapping.class,
					XmlElementNames.FileAsMapping, FieldUris.FileAsMapping, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the DisplayName property.
	 */
	public static final PropertyDefinition DisplayName =
			new StringPropertyDefinition(
					XmlElementNames.DisplayName, FieldUris.DisplayName, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the GivenName property.
	 */
	public static final PropertyDefinition GivenName =
			new StringPropertyDefinition(
					XmlElementNames.GivenName, FieldUris.GivenName, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Initials property.
	 */
	public static final PropertyDefinition Initials =
			new StringPropertyDefinition(
					XmlElementNames.Initials, FieldUris.Initials, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the MiddleName property.
	 */
	public static final PropertyDefinition MiddleName =
			new StringPropertyDefinition(
					XmlElementNames.MiddleName, FieldUris.MiddleName, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the NickName property.
	 */
	public static final PropertyDefinition NickName =
			new StringPropertyDefinition(
					XmlElementNames.NickName, FieldUris.NickName, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the CompleteName property.
	 */
	public static final PropertyDefinition CompleteName =
			new ComplexPropertyDefinition<CompleteName>(
					CompleteName.class,
					XmlElementNames.CompleteName, FieldUris.CompleteName, EnumSet
							.of(PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1,
					new ICreateComplexPropertyDelegate<CompleteName>() {
						public CompleteName createComplexProperty() {
							return new CompleteName();
						}
					});

	/***
	 * Defines the CompanyName property.
	 */
	public static final PropertyDefinition CompanyName =
			new StringPropertyDefinition(
					XmlElementNames.CompanyName, FieldUris.CompanyName, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the EmailAddresses property.
	 */
	public static final PropertyDefinition EmailAddresses =
			new ComplexPropertyDefinition<EmailAddressDictionary>(
					EmailAddressDictionary.class,
					XmlElementNames.EmailAddresses,
					FieldUris.EmailAddresses,
					EnumSet.of(PropertyDefinitionFlags.AutoInstantiateOnRead,
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate),
					ExchangeVersion.Exchange2007_SP1,
					new ICreateComplexPropertyDelegate
					<EmailAddressDictionary>() {
						public EmailAddressDictionary createComplexProperty() {
							return new EmailAddressDictionary();
						}
					});

	/***
	 * Defines the PhysicalAddresses property.
	 */
	public static final PropertyDefinition PhysicalAddresses =
			new ComplexPropertyDefinition<PhysicalAddressDictionary>(
					PhysicalAddressDictionary.class,
					XmlElementNames.PhysicalAddresses,
					FieldUris.PhysicalAddresses,
					EnumSet.of(PropertyDefinitionFlags.AutoInstantiateOnRead,
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate),
					ExchangeVersion.Exchange2007_SP1,
					new ICreateComplexPropertyDelegate
					<PhysicalAddressDictionary>() {
						public PhysicalAddressDictionary createComplexProperty() {
							return new PhysicalAddressDictionary();
						}
					});

	/***
	 * Defines the PhoneNumbers property.
	 */
	public static final PropertyDefinition PhoneNumbers =
			new ComplexPropertyDefinition<PhoneNumberDictionary>(
					PhoneNumberDictionary.class,
					XmlElementNames.PhoneNumbers,
					FieldUris.PhoneNumbers,
					EnumSet.of(PropertyDefinitionFlags.AutoInstantiateOnRead,
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate),
					ExchangeVersion.Exchange2007_SP1,
					new ICreateComplexPropertyDelegate
					<PhoneNumberDictionary>() {
						public PhoneNumberDictionary createComplexProperty() {
							return new PhoneNumberDictionary();
						}
					});

	/***
	 * Defines the AssistantName property.
	 */
	public static final PropertyDefinition AssistantName =
			new StringPropertyDefinition(
					XmlElementNames.AssistantName, FieldUris.AssistantName, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Birthday property.
	 */
	public static final PropertyDefinition Birthday =
			new DateTimePropertyDefinition(
					XmlElementNames.Birthday, FieldUris.Birthday, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the BusinessHomePage property.
	 * 
	 * Defined as anyURI in the EWS schema. String is fine here.
	 */
	public static final PropertyDefinition BusinessHomePage =
			new StringPropertyDefinition(
					XmlElementNames.BusinessHomePage, FieldUris.BusinessHomePage,
					EnumSet.of(PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Children property.
	 */
	public static final PropertyDefinition Children =
			new ComplexPropertyDefinition<StringList>(
					StringList.class,
					XmlElementNames.Children, FieldUris.Children, EnumSet.of(
							PropertyDefinitionFlags.AutoInstantiateOnRead,
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1,
					new ICreateComplexPropertyDelegate<StringList>() {
						public StringList createComplexProperty() {
							return new StringList();
						}
					});

	/***
	 * Defines the Companies property.
	 */
	public static final PropertyDefinition Companies =
			new ComplexPropertyDefinition<StringList>(
					StringList.class,
					XmlElementNames.Companies, FieldUris.Companies, EnumSet.of(
							PropertyDefinitionFlags.AutoInstantiateOnRead,
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1,
					new ICreateComplexPropertyDelegate<StringList>() {
						public StringList createComplexProperty() {
							return new StringList();
						}
					});

	/***
	 * Defines the ContactSource property.
	 */
	public static final PropertyDefinition ContactSource =
			new GenericPropertyDefinition<ContactSource>(
					ContactSource.class,
					XmlElementNames.ContactSource, FieldUris.ContactSource, EnumSet
							.of(PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Department property.
	 */
	public static final PropertyDefinition Department =
			new StringPropertyDefinition(
					XmlElementNames.Department, FieldUris.Department, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Generation property.
	 */
	public static final PropertyDefinition Generation =
			new StringPropertyDefinition(
					XmlElementNames.Generation, FieldUris.Generation, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the ImAddresses property.
	 */
	public static final PropertyDefinition ImAddresses =
			new ComplexPropertyDefinition<ImAddressDictionary>(
					ImAddressDictionary.class,
					XmlElementNames.ImAddresses, FieldUris.ImAddresses, EnumSet.of(
							PropertyDefinitionFlags.AutoInstantiateOnRead,
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate),
					ExchangeVersion.Exchange2007_SP1,
					new ICreateComplexPropertyDelegate<ImAddressDictionary>() {
						public ImAddressDictionary createComplexProperty() {
							return new ImAddressDictionary();
						}
					});

	/***
	 * Defines the JobTitle property.
	 */
	public static final PropertyDefinition JobTitle =
			new StringPropertyDefinition(
					XmlElementNames.JobTitle, FieldUris.JobTitle, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Manager property.
	 */
	public static final PropertyDefinition Manager =
			new StringPropertyDefinition(
					XmlElementNames.Manager, FieldUris.Manager, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Mileage property.
	 */
	public static final PropertyDefinition Mileage =
			new StringPropertyDefinition(
					XmlElementNames.Mileage, FieldUris.Mileage, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the OfficeLocation property.
	 */
	public static final PropertyDefinition OfficeLocation =
			new StringPropertyDefinition(
					XmlElementNames.OfficeLocation, FieldUris.OfficeLocation, EnumSet
							.of(PropertyDefinitionFlags.CanSet,
									PropertyDefinitionFlags.CanUpdate,
									PropertyDefinitionFlags.CanDelete,
									PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the PostalAddressIndex property.
	 */
	public static final PropertyDefinition PostalAddressIndex =
			new GenericPropertyDefinition<PhysicalAddressIndex>(
					PhysicalAddressIndex.class,
					XmlElementNames.PostalAddressIndex, FieldUris.PostalAddressIndex,
					EnumSet.of(PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Profession property.
	 */
	public static final PropertyDefinition Profession =
			new StringPropertyDefinition(
					XmlElementNames.Profession, FieldUris.Profession, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the SpouseName property.
	 */
	public static final PropertyDefinition SpouseName =
			new StringPropertyDefinition(
					XmlElementNames.SpouseName, FieldUris.SpouseName, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the Surname property.
	 */
	public static final PropertyDefinition Surname =
			new StringPropertyDefinition(
					XmlElementNames.Surname, FieldUris.Surname, EnumSet.of(
							PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the WeddingAnniversary property.
	 */
	public static final PropertyDefinition WeddingAnniversary =
			new DateTimePropertyDefinition(
					XmlElementNames.WeddingAnniversary, FieldUris.WeddingAnniversary,
					EnumSet.of(PropertyDefinitionFlags.CanSet,
							PropertyDefinitionFlags.CanUpdate,
							PropertyDefinitionFlags.CanDelete,
							PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2007_SP1);

	/***
	 * Defines the HasPicture property.
	 */
	public static final PropertyDefinition HasPicture =
			new BoolPropertyDefinition(
					XmlElementNames.HasPicture, FieldUris.HasPicture, EnumSet
							.of(PropertyDefinitionFlags.CanFind),
					ExchangeVersion.Exchange2010);

	/***
	 * Defines the EmailAddress1 property.
	 */
	public static final IndexedPropertyDefinition EmailAddress1 =
			new IndexedPropertyDefinition(
					FieldUris.EmailAddress, "EmailAddress1");

	/***
	 * Defines the EmailAddress2 property.
	 */
	public static final IndexedPropertyDefinition EmailAddress2 =
			new IndexedPropertyDefinition(
					FieldUris.EmailAddress, "EmailAddress2");

	/***
	 * Defines the EmailAddress3 property.
	 */
	public static final IndexedPropertyDefinition EmailAddress3 =
			new IndexedPropertyDefinition(
					FieldUris.EmailAddress, "EmailAddress3");

	/***
	 * Defines the ImAddress1 property.
	 */
	public static final IndexedPropertyDefinition ImAddress1 =
			new IndexedPropertyDefinition(
					FieldUris.ImAddress, "ImAddress1");

	/***
	 * Defines the ImAddress2 property.
	 */
	public static final IndexedPropertyDefinition ImAddress2 =
			new IndexedPropertyDefinition(
					FieldUris.ImAddress, "ImAddress2");

	/***
	 * Defines the ImAddress3 property.
	 */
	public static final IndexedPropertyDefinition ImAddress3 =
			new IndexedPropertyDefinition(
					FieldUris.ImAddress, "ImAddress3");

	/***
	 * Defines the AssistentPhone property.
	 */
	public static final IndexedPropertyDefinition AssistantPhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "AssistantPhone");

	/***
	 * Defines the BusinessFax property.
	 */
	public static final IndexedPropertyDefinition BusinessFax =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "BusinessFax");

	/***
	 * Defines the BusinessPhone property.
	 */
	public static final IndexedPropertyDefinition BusinessPhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "BusinessPhone");

	/***
	 * Defines the BusinessPhone2 property.
	 */
	public static final IndexedPropertyDefinition BusinessPhone2 =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "BusinessPhone2");

	/***
	 * Defines the Callback property.
	 */
	public static final IndexedPropertyDefinition Callback =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "Callback");

	/***
	 * Defines the CarPhone property.
	 */
	public static final IndexedPropertyDefinition CarPhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "CarPhone");

	/***
	 * Defines the CompanyMainPhone property.
	 */
	public static final IndexedPropertyDefinition CompanyMainPhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "CompanyMainPhone");

	/***
	 * Defines the HomeFax property.
	 */
	public static final IndexedPropertyDefinition HomeFax =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "HomeFax");

	/***
	 * Defines the HomePhone property.
	 */
	public static final IndexedPropertyDefinition HomePhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "HomePhone");

	/***
	 * Defines the HomePhone2 property.
	 */
	public static final IndexedPropertyDefinition HomePhone2 =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "HomePhone2");

	/***
	 * Defines the Isdn property.
	 */
	public static final IndexedPropertyDefinition Isdn =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "Isdn");

	/***
	 * Defines the MobilePhone property.
	 */
	public static final IndexedPropertyDefinition MobilePhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "MobilePhone");

	/***
	 * Defines the OtherFax property.
	 */
	public static final IndexedPropertyDefinition OtherFax =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "OtherFax");

	/***
	 * Defines the OtherTelephone property.
	 */
	public static final IndexedPropertyDefinition OtherTelephone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "OtherTelephone");

	/***
	 * Defines the Pager property.
	 */
	public static final IndexedPropertyDefinition Pager =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "Pager");

	/***
	 * Defines the PrimaryPhone property.
	 */
	public static final IndexedPropertyDefinition PrimaryPhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "PrimaryPhone");

	/***
	 * Defines the RadioPhone property.
	 */
	public static final IndexedPropertyDefinition RadioPhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "RadioPhone");

	/***
	 * Defines the Telex property.
	 */
	public static final IndexedPropertyDefinition Telex =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "Telex");

	/***
	 * Defines the TtyTddPhone property.
	 */
	public static final IndexedPropertyDefinition TtyTddPhone =
			new IndexedPropertyDefinition(
					FieldUris.PhoneNumber, "TtyTddPhone");

	/***
	 * Defines the BusinessAddressStreet property.
	 */
	public static final IndexedPropertyDefinition BusinessAddressStreet =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressStreet, "Business");

	/***
	 * Defines the BusinessAddressCity property.
	 */
	public static final IndexedPropertyDefinition BusinessAddressCity =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressCity, "Business");

	/***
	 * Defines the BusinessAddressState property.
	 */
	public static final IndexedPropertyDefinition BusinessAddressState =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressState, "Business");

	/***
	 * Defines the BusinessAddressCountryOrRegion property.
	 */
	public static final IndexedPropertyDefinition BusinessAddressCountryOrRegion =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressCountryOrRegion, "Business");

	/***
	 * Defines the BusinessAddressPostalCode property.
	 */
	public static final IndexedPropertyDefinition BusinessAddressPostalCode =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressPostalCode, "Business");

	/***
	 * Defines the HomeAddressStreet property.
	 */
	public static final IndexedPropertyDefinition HomeAddressStreet =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressStreet, "Home");

	/***
	 * Defines the HomeAddressCity property.
	 */
	public static final IndexedPropertyDefinition HomeAddressCity =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressCity, "Home");

	/***
	 * Defines the HomeAddressState property.
	 */
	public static final IndexedPropertyDefinition HomeAddressState =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressState, "Home");

	/***
	 * Defines the HomeAddressCountryOrRegion property.
	 */
	public static final IndexedPropertyDefinition HomeAddressCountryOrRegion =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressCountryOrRegion, "Home");

	/***
	 * Defines the HomeAddressPostalCode property.
	 */
	public static final IndexedPropertyDefinition HomeAddressPostalCode =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressPostalCode, "Home");

	/***
	 * Defines the OtherAddressStreet property.
	 */
	public static final IndexedPropertyDefinition OtherAddressStreet =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressStreet, "Other");

	/***
	 * Defines the OtherAddressCity property.
	 */
	public static final IndexedPropertyDefinition OtherAddressCity =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressCity, "Other");

	/***
	 * Defines the OtherAddressState property.
	 */
	public static final IndexedPropertyDefinition OtherAddressState =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressState, "Other");

	/***
	 * Defines the OtherAddressCountryOrRegion property.
	 */
	public static final IndexedPropertyDefinition OtherAddressCountryOrRegion =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressCountryOrRegion, "Other");

	/***
	 * Defines the OtherAddressPostalCode property.
	 */
	public static final IndexedPropertyDefinition OtherAddressPostalCode =
			new IndexedPropertyDefinition(
					FieldUris.PhysicalAddressPostalCode, "Other");

	// This must be declared after the property definitions
	/** The Constant Instance. */
	protected static final ContactSchema Instance = new ContactSchema();

	/***
	 * Registers properties.
	 * 
	 * IMPORTANT NOTE: PROPERTIES MUST BE REGISTERED IN SCHEMA ORDER (i.e. the same order as they are defined in types.xsd)
	 */
	@Override
	protected void registerProperties() {
		super.registerProperties();

		registerProperty(FileAs);
		registerProperty(FileAsMapping);
		registerProperty(DisplayName);
		registerProperty(GivenName);
		registerProperty(Initials);
		registerProperty(MiddleName);
		registerProperty(NickName);
		registerProperty(CompleteName);
		registerProperty(CompanyName);
		registerProperty(EmailAddresses);
		registerProperty(PhysicalAddresses);
		registerProperty(PhoneNumbers);
		registerProperty(AssistantName);
		registerProperty(Birthday);
		registerProperty(BusinessHomePage);
		registerProperty(Children);
		registerProperty(Companies);
		registerProperty(ContactSource);
		registerProperty(Department);
		registerProperty(Generation);
		registerProperty(ImAddresses);
		registerProperty(JobTitle);
		registerProperty(Manager);
		registerProperty(Mileage);
		registerProperty(OfficeLocation);
		registerProperty(PostalAddressIndex);
		registerProperty(Profession);
		registerProperty(SpouseName);
		registerProperty(Surname);
		registerProperty(WeddingAnniversary);
		registerProperty(HasPicture);

		registerIndexedProperty(EmailAddress1);
		registerIndexedProperty(EmailAddress2);
		registerIndexedProperty(EmailAddress3);
		registerIndexedProperty(ImAddress1);
		registerIndexedProperty(ImAddress2);
		registerIndexedProperty(ImAddress3);
		registerIndexedProperty(AssistantPhone);
		registerIndexedProperty(BusinessFax);
		registerIndexedProperty(BusinessPhone);
		registerIndexedProperty(BusinessPhone2);
		registerIndexedProperty(Callback);
		registerIndexedProperty(CarPhone);
		registerIndexedProperty(CompanyMainPhone);
		registerIndexedProperty(HomeFax);
		registerIndexedProperty(HomePhone);
		registerIndexedProperty(HomePhone2);
		registerIndexedProperty(Isdn);
		registerIndexedProperty(MobilePhone);
		registerIndexedProperty(OtherFax);
		registerIndexedProperty(OtherTelephone);
		registerIndexedProperty(Pager);
		registerIndexedProperty(PrimaryPhone);
		registerIndexedProperty(RadioPhone);
		registerIndexedProperty(Telex);
		registerIndexedProperty(TtyTddPhone);
		registerIndexedProperty(BusinessAddressStreet);
		registerIndexedProperty(BusinessAddressCity);
		registerIndexedProperty(BusinessAddressState);
		registerIndexedProperty(BusinessAddressCountryOrRegion);
		registerIndexedProperty(BusinessAddressPostalCode);
		registerIndexedProperty(HomeAddressStreet);
		registerIndexedProperty(HomeAddressCity);
		registerIndexedProperty(HomeAddressState);
		registerIndexedProperty(HomeAddressCountryOrRegion);
		registerIndexedProperty(HomeAddressPostalCode);
		registerIndexedProperty(OtherAddressStreet);
		registerIndexedProperty(OtherAddressCity);
		registerIndexedProperty(OtherAddressState);
		registerIndexedProperty(OtherAddressCountryOrRegion);
		registerIndexedProperty(OtherAddressPostalCode);
	}

	/**
	 * Instantiates a new contact schema.
	 */
	ContactSchema() {
		super();
	}
}
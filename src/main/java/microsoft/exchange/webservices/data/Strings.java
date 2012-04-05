package microsoft.exchange.webservices.data;

import java.util.Properties;

public abstract class Strings {

	static Properties BUNDLE = new Properties();
	/*static Locale locale;
	static ResourceBundle rb;*/

	public static String BothSearchFilterAndQueryStringCannotBeSpecified = "BothSearchFilterAndQueryStringCannotBeSpecified";
	public static String IndexIsOutOfRange = "IndexIsOutOfRange";
	public static String CannotCallConnectDuringLiveConnection = "CannotCallConnectDuringLiveConnection";
	public static String InvalidAutodiscoverSmtpAddressesCount = "InvalidAutodiscoverSmtpAddressesCount";
	public static String NoSoapOrWsSecurityEndpointAvailable = "NoSoapOrWsSecurityEndpointAvailable";
	public static String ObjectDoesNotHaveId = "ObjectDoesNotHaveId";
	public static String PropertyCannotBeDeleted = "PropertyCannotBeDeleted";
	public static String CannotSaveNotNewUserConfiguration = "CannotSaveNotNewUserConfiguration";
	public static String PhoneCallAlreadyDisconnected = "PhoneCallAlreadyDisconnected";
	public static String MethodIncompatibleWithRequestVersion = "MethodIncompatibleWithRequestVersion";
	public static String TimeWindowStartTimeMustBeGreaterThanEndTime = "TimeWindowStartTimeMustBeGreaterThanEndTime";
	public static String ValueOfTypeCannotBeConverted = "ValueOfTypeCannotBeConverted";
	public static String ItemAttachmentCannotBeUpdated = "ItemAttachmentCannotBeUpdated";
	public static String CreateItemsDoesNotAllowAttachments = "CreateItemsDoesNotAllowAttachments";
	public static String DeletingThisObjectTypeNotAuthorized = "DeletingThisObjectTypeNotAuthorized";
	public static String SearchFilterComparisonValueTypeIsNotSupported = "SearchFilterComparisonValueTypeIsNotSupported";
	public static String ServiceUrlMustBeSet = "ServiceUrlMustBeSet";
	public static String OperationNotSupportedForPropertyDefinitionType = "OperationNotSupportedForPropertyDefinitionType";
	public static String ValueMustBeGreaterThanZero = "ValueMustBeGreaterThanZero";
	public static String NoSubscriptionsOnConnection = "NoSubscriptionsOnConnection";
	public static String CreateItemsDoesNotHandleExistingItems = "CreateItemsDoesNotHandleExistingItems";
	public static String AccountIsLocked = "AccountIsLocked";
	public static String UnexpectedElement = "UnexpectedElement";
	public static String InvalidTimeoutValue = "InvalidTimeoutValue";
	public static String PropertyAlreadyExistsInOrderByCollection = "PropertyAlreadyExistsInOrderByCollection";
	public static String StartTimeZoneRequired = "StartTimeZoneRequired";
	public static String UnsupportedWebProtocol = "UnsupportedWebProtocol";
	public static String EqualityComparisonFilterIsInvalid = "EqualityComparisonFilterIsInvalid";
	public static String LoadingThisObjectTypeNotSupported = "LoadingThisObjectTypeNotSupported";
	public static String ValuePropertyNotAssigned = "ValuePropertyNotAssigned";
	public static String FolderPermissionLevelMustBeSet = "FolderPermissionLevelMustBeSet";
	public static String EndDateMustBeGreaterThanStartDate = "EndDateMustBeGreaterThanStartDate";
	public static String InvalidOrderBy = "InvalidOrderBy";
	public static String ElementValueCannotBeSerialized = "ElementValueCannotBeSerialized";
	public static String InvalidAttributeValue = "InvalidAttributeValue";
	public static String InvalidUser = "InvalidUser";
	public static String MinuteMustBeBetween0And59 = "MinuteMustBeBetween0And59";
	public static String CredentialsRequired = "CredentialsRequired";
	public static String AdditionalPropertyIsNull = "AdditionalPropertyIsNull";
	public static String DeleteInvalidForUnsavedUserConfiguration = "DeleteInvalidForUnsavedUserConfiguration";
	public static String CannotUpdateNewUserConfiguration = "CannotUpdateNewUserConfiguration";
	public static String PropertyDefinitionPropertyMustBeSet = "PropertyDefinitionPropertyMustBeSet";
	public static String IdAlreadyInList = "IdAlreadyInList";
	public static String ObjectTypeIncompatibleWithRequestVersion = "ObjectTypeIncompatibleWithRequestVersion";
	public static String InvalidEmailAddress = "InvalidEmailAddress";
	public static String InvalidAutodiscoverDomain = "InvalidAutodiscoverDomain";
	public static String ItemAttachmentMustBeNamed = "ItemAttachmentMustBeNamed";
	public static String ArrayMustHaveSingleDimension = "ArrayMustHaveSingleDimension";
	public static String DayOfWeekIndexMustBeSpecifiedForRecurrencePattern = "DayOfWeekIndexMustBeSpecifiedForRecurrencePattern";
	public static String InvalidRecurrencePattern = "InvalidRecurrencePattern";
	public static String ItemIsOutOfDate = "ItemIsOutOfDate";
	public static String AutodiscoverInvalidSettingForOutlookProvider = "AutodiscoverInvalidSettingForOutlookProvider";
	public static String MinutesMustBeBetween0And1439 = "MinutesMustBeBetween0And1439";
	public static String MaxChangesMustBeBetween1And512 = "MaxChangesMustBeBetween1And512";
	public static String InvalidDomainName = "InvalidDomainName";
	public static String ServiceObjectAlreadyHasId = "ServiceObjectAlreadyHasId";
	public static String ParameterIncompatibleWithRequestVersion = "ParameterIncompatibleWithRequestVersion";
	public static String RecurrencePatternMustHaveStartDate = "RecurrencePatternMustHaveStartDate";
	public static String ServiceResponseDoesNotContainXml = "ServiceResponseDoesNotContainXml";
	public static String FrequencyMustBeBetween1And1440 = "FrequencyMustBeBetween1And1440";
	public static String UnexpectedEndOfXmlDocument = "UnexpectedEndOfXmlDocument";
	public static String TimeoutMustBeGreaterThanZero = "TimeoutMustBeGreaterThanZero";
	public static String DurationMustBeSpecifiedWhenScheduled = "DurationMustBeSpecifiedWhenScheduled";
	public static String InvalidPropertyValueNotInRange = "InvalidPropertyValueNotInRange";
	public static String RegenerationPatternsOnlyValidForTasks = "RegenerationPatternsOnlyValidForTasks";
	public static String IEnumerableDoesNotContainThatManyObject = "IEnumerableDoesNotContainThatManyObject";
	public static String WLIDCredentialsCannotBeUsedWithLegacyAutodiscover = "WLIDCredentialsCannotBeUsedWithLegacyAutodiscover";
	public static String TooFewServiceReponsesReturned = "TooFewServiceReponsesReturned";
	public static String IntervalMustBeGreaterOrEqualToOne = "IntervalMustBeGreaterOrEqualToOne";
	public static String AutodiscoverServiceRequestRequiresDomainOrUrl = "AutodiscoverServiceRequestRequiresDomainOrUrl";
	public static String DayOfMonthMustBeBetween1And31 = "DayOfMonthMustBeBetween1And31";
	public static String ValueCannotBeConverted = "ValueCannotBeConverted";
	public static String SearchFilterMustBeSet = "SearchFilterMustBeSet";
	public static String CannotSetPermissionLevelToCustom = "CannotSetPermissionLevelToCustom";
	public static String PropertyIncompatibleWithRequestVersion = "PropertyIncompatibleWithRequestVersion";
	public static String PropertyDefinitionTypeMismatch = "PropertyDefinitionTypeMismatch";
	public static String AutodiscoverRedirectBlocked = "AutodiscoverRedirectBlocked";
	public static String ExpectedStartElement = "ExpectedStartElement";
	public static String InvalidFrequencyValue = "InvalidFrequencyValue";
	public static String CannotSubscribeToStatusEvents = "CannotSubscribeToStatusEvents";
	public static String TimeoutMustBeBetween1And1440 = "TimeoutMustBeBetween1And1440";
	public static String ValidationFailed = "ValidationFailed";
	public static String NumberOfOccurrencesMustBeGreaterThanZero = "NumberOfOccurrencesMustBeGreaterThanZero";
	public static String DelegateUserHasInvalidUserId = "DelegateUserHasInvalidUserId";
	public static String OccurrenceIndexMustBeGreaterThanZero = "OccurrenceIndexMustBeGreaterThanZero";
	public static String InvalidElementStringValue = "InvalidElementStringValue";
	public static String UnexpectedElementType = "UnexpectedElementType";
	public static String IncompatibleTypeForArray = "IncompatibleTypeForArray";
	public static String CannotCallDisconnectWithNoLiveConnection = "CannotCallDisconnectWithNoLiveConnection";
	public static String AutodiscoverDidNotReturnEwsUrl = "AutodiscoverDidNotReturnEwsUrl";
	public static String AutodiscoverError = "AutodiscoverError";
	public static String MustLoadOrAssignPropertyBeforeAccess = "MustLoadOrAssignPropertyBeforeAccess";
	public static String CollectionIsEmpty = "CollectionIsEmpty";
	public static String PropertyValueMustBeSpecifiedForRecurrencePattern = "PropertyValueMustBeSpecifiedForRecurrencePattern";
	public static String InvalidOrUnsupportedTimeZoneDefinition = "InvalidOrUnsupportedTimeZoneDefinition";
	public static String AttachmentCannotBeUpdated = "AttachmentCannotBeUpdated";
	public static String PercentCompleteMustBeBetween0And100 = "PercentCompleteMustBeBetween0And100";
	public static String CannotAddSubscriptionToLiveConnection = "CannotAddSubscriptionToLiveConnection";
	public static String MaximumRedirectionHopsExceeded = "MaximumRedirectionHopsExceeded";
	public static String PropertySetCannotBeModified = "PropertySetCannotBeModified";
	public static String PropertyIsReadOnly = "PropertyIsReadOnly";
	public static String ZeroLengthArrayInvalid = "ZeroLengthArrayInvalid";
	public static String ServerErrorAndStackTraceDetails = "ServerErrorAndStackTraceDetails";
	public static String CurrentPositionNotElementStart = "CurrentPositionNotElementStart";
	public static String ArrayMustHaveAtLeastOneElement = "ArrayMustHaveAtLeastOneElement";
	public static String NullStringArrayElementInvalid = "NullStringArrayElementInvalid";
	public static String TagValueIsOutOfRange = "TagValueIsOutOfRange";
	public static String ElementNotFound = "ElementNotFound";
	public static String NonSummaryPropertyCannotBeUsed = "NonSummaryPropertyCannotBeUsed";
	public static String AutodiscoverCouldNotBeLocated = "AutodiscoverCouldNotBeLocated";
	public static String InvalidRedirectionResponseReturned = "InvalidRedirectionResponseReturned";
	public static String InvalidMailboxType = "InvalidMailboxType";
	public static String PeriodNotFound = "PeriodNotFound";
	public static String CannotSetDelegateFolderPermissionLevelToCustom = "CannotSetDelegateFolderPermissionLevelToCustom";
	public static String ValuePropertyMustBeSet = "ValuePropertyMustBeSet";
	public static String ArgumentIsBlankString = "ArgumentIsBlankString";
	public static String IdPropertyMustBeSet = "IdPropertyMustBeSet";
	public static String XsDurationCouldNotBeParsed = "XsDurationCouldNotBeParsed";
	public static String CannotRemoveSubscriptionFromLiveConnection = "CannotRemoveSubscriptionFromLiveConnection";
	public static String NoAppropriateConstructorForItemClass = "NoAppropriateConstructorForItemClass";
	public static String FileAttachmentContentIsNotSet = "FileAttachmentContentIsNotSet";
	public static String AttachmentCollectionNotLoaded = "AttachmentCollectionNotLoaded";
	public static String OperationDoesNotSupportAttachments = "OperationDoesNotSupportAttachments";
	public static String ObjectTypeNotSupported = "ObjectTypeNotSupported";
	public static String ItemToUpdateCannotBeNullOrNew = "ItemToUpdateCannotBeNullOrNew";
	public static String ReadAccessInvalidForNonCalendarFolder = "ReadAccessInvalidForNonCalendarFolder";
	public static String UnsupportedTimeZonePeriodTransitionTarget = "UnsupportedTimeZonePeriodTransitionTarget";
	public static String InvalidAutodiscoverRequest = "InvalidAutodiscoverRequest";
	public static String MergedFreeBusyIntervalMustBeSmallerThanTimeWindow = "MergedFreeBusyIntervalMustBeSmallerThanTimeWindow";
	public static String MaxScpHopsExceeded = "MaxScpHopsExceeded";
	public static String TransitionGroupNotFound = "TransitionGroupNotFound";
	public static String ServiceObjectDoesNotHaveId = "ServiceObjectDoesNotHaveId";
	public static String InvalidAutodiscoverServiceResponse = "InvalidAutodiscoverServiceResponse";
	public static String AtLeastOneAttachmentCouldNotBeDeleted = "AtLeastOneAttachmentCouldNotBeDeleted";
	public static String ServiceRequestFailed = "ServiceRequestFailed";
	public static String SecondMustBeBetween0And59 = "SecondMustBeBetween0And59";
	public static String SearchParametersRootFolderIdsEmpty = "SearchParametersRootFolderIdsEmpty";
	public static String CannotConvertBetweenTimeZones = "CannotConvertBetweenTimeZones";
	public static String FolderTypeNotCompatible = "FolderTypeNotCompatible";
	public static String EnumValueIncompatibleWithRequestVersion = "EnumValueIncompatibleWithRequestVersion";
	public static String UserIdForDelegateUserNotSpecified = "UserIdForDelegateUserNotSpecified";
	public static String AttributeValueCannotBeSerialized = "AttributeValueCannotBeSerialized";
	public static String ContactGroupMemberCannotBeUpdatedWithoutBeingLoadedFirst = "ContactGroupMemberCannotBeUpdatedWithoutBeingLoadedFirst";
	public static String HourMustBeBetween0And23 = "HourMustBeBetween0And23";
	public static String MonthMustBeSpecifiedForRecurrencePattern = "MonthMustBeSpecifiedForRecurrencePattern";
	public static String NoError = "NoError";
	public static String PermissionLevelInvalidForNonCalendarFolder = "PermissionLevelInvalidForNonCalendarFolder";
	public static String InvalidDateTime = "InvalidDateTime";
	public static String PropertyCannotBeUpdated = "PropertyCannotBeUpdated";
	public static String InvalidAutodiscoverDomainsCount = "InvalidAutodiscoverDomainsCount";
	public static String DaysOfTheWeekNotSpecified = "DaysOfTheWeekNotSpecified";
	public static String RequestIncompatibleWithRequestVersion = "RequestIncompatibleWithRequestVersion";
	public static String UpdateItemsDoesNotSupportNewOrUnchangedItems = "UpdateItemsDoesNotSupportNewOrUnchangedItems";
	public static String CannotAddRequestHeader = "CannotAddRequestHeader";
	public static String ParentFolderDoesNotHaveId = "ParentFolderDoesNotHaveId";
	public static String DayOfTheWeekMustBeSpecifiedForRecurrencePattern = "DayOfTheWeekMustBeSpecifiedForRecurrencePattern";
	public static String ServerVersionNotSupported = "ServerVersionNotSupported";
	public static String NewMessagesWithAttachmentsCannotBeSentDirectly = "NewMessagesWithAttachmentsCannotBeSentDirectly";
	public static String SearchFilterAtIndexIsInvalid = "SearchFilterAtIndexIsInvalid";
	public static String ItemTypeNotCompatible = "ItemTypeNotCompatible";
	public static String ClassIncompatibleWithRequestVersion = "ClassIncompatibleWithRequestVersion";
	public static String UpdateItemsDoesNotAllowAttachments = "UpdateItemsDoesNotAllowAttachments";
	public static String UnknownTimeZonePeriodTransitionType = "UnknownTimeZonePeriodTransitionType";
	public static String FolderToUpdateCannotBeNullOrNew = "FolderToUpdateCannotBeNullOrNew";
	public static String FolderPermissionHasInvalidUserId = "FolderPermissionHasInvalidUserId";
	public static String AutodiscoverServiceIncompatibleWithRequestVersion = "AutodiscoverServiceIncompatibleWithRequestVersion";
	public static String InvalidAutodiscoverSettingsCount = "InvalidAutodiscoverSettingsCount";
	public static String AttachmentCreationFailed = "AttachmentCreationFailed";
	public static String ValuePropertyNotLoaded = "ValuePropertyNotLoaded";
	public static String OffsetMustBeGreaterThanZero = "OffsetMustBeGreaterThanZero";
	public static String InvalidRecurrenceRange = "InvalidRecurrenceRange";
	public static String DayOfMonthMustBeSpecifiedForRecurrencePattern = "DayOfMonthMustBeSpecifiedForRecurrencePattern";
	public static String InvalidAutodiscoverSmtpAddress = "InvalidAutodiscoverSmtpAddress";

	static
	{
		/*try 
		{
			 //BUNDLE.load(new FileInputStream("Strings.properties"));
			 BUNDLE.load(new FileInputStream("Strings.properties"));
			 

			  
			 /*locale = Locale.getDefault();//new Locale(language, country);
		     rb = ResourceBundle.getBundle("Strings", locale);
		     System.out.println(rb.getString("IndexIsOutOfRange") + " ( " + 
		     locale.getDisplayLanguage() + "," + locale.getDisplayCountry() + ").\n");
		
		} 
		catch (FileNotFoundException e) 
		{
			try{
				URL url = ClassLoader.getSystemResource("microsoft/exchange/webservices/data/Strings.properties");
			
			 if (url != null)
				 BUNDLE.load(url.openStream());
			}catch(Exception ex){
			throw new InstantiationError(e.getMessage());
			}
		} 
		catch (IOException e) 
		{
			throw new InstantiationError(e.getMessage());
		}*/

		try {
			BUNDLE.load(Thread.currentThread().getContextClassLoader().getResource("Strings.properties").openStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadProperties();
	}

	private static void loadProperties()
	{
		BothSearchFilterAndQueryStringCannotBeSpecified = BUNDLE.getProperty("BothSearchFilterAndQueryStringCannotBeSpecified");
		// BothSearchFilterAndQueryStringCannotBeSpecified = rb.getString("BothSearchFilterAndQueryStringCannotBeSpecified");

		IndexIsOutOfRange = BUNDLE.getProperty("IndexIsOutOfRange");
		// IndexIsOutOfRange=rb.getString("IndexIsOutOfRange");

		CannotCallConnectDuringLiveConnection = BUNDLE.getProperty("CannotCallConnectDuringLiveConnection");
		InvalidAutodiscoverSmtpAddressesCount = BUNDLE.getProperty("InvalidAutodiscoverSmtpAddressesCount");
		NoSoapOrWsSecurityEndpointAvailable = BUNDLE.getProperty("NoSoapOrWsSecurityEndpointAvailable");
		ObjectDoesNotHaveId = BUNDLE.getProperty("ObjectDoesNotHaveId");
		PropertyCannotBeDeleted = BUNDLE.getProperty("PropertyCannotBeDeleted");
		CannotSaveNotNewUserConfiguration = BUNDLE.getProperty("CannotSaveNotNewUserConfiguration");
		PhoneCallAlreadyDisconnected = BUNDLE.getProperty("PhoneCallAlreadyDisconnected");
		MethodIncompatibleWithRequestVersion = BUNDLE.getProperty("MethodIncompatibleWithRequestVersion");
		TimeWindowStartTimeMustBeGreaterThanEndTime = BUNDLE.getProperty("TimeWindowStartTimeMustBeGreaterThanEndTime");
		ValueOfTypeCannotBeConverted = BUNDLE.getProperty("ValueOfTypeCannotBeConverted");
		ItemAttachmentCannotBeUpdated = BUNDLE.getProperty("ItemAttachmentCannotBeUpdated");
		CreateItemsDoesNotAllowAttachments = BUNDLE.getProperty("CreateItemsDoesNotAllowAttachments");
		DeletingThisObjectTypeNotAuthorized = BUNDLE.getProperty("DeletingThisObjectTypeNotAuthorized");
		SearchFilterComparisonValueTypeIsNotSupported = BUNDLE.getProperty("SearchFilterComparisonValueTypeIsNotSupported");
		ServiceUrlMustBeSet = BUNDLE.getProperty("ServiceUrlMustBeSet");
		OperationNotSupportedForPropertyDefinitionType = BUNDLE.getProperty("OperationNotSupportedForPropertyDefinitionType");
		ValueMustBeGreaterThanZero = BUNDLE.getProperty("ValueMustBeGreaterThanZero");
		NoSubscriptionsOnConnection = BUNDLE.getProperty("NoSubscriptionsOnConnection");
		CreateItemsDoesNotHandleExistingItems = BUNDLE.getProperty("CreateItemsDoesNotHandleExistingItems");
		AccountIsLocked = BUNDLE.getProperty("AccountIsLocked");
		UnexpectedElement = BUNDLE.getProperty("UnexpectedElement");
		InvalidTimeoutValue = BUNDLE.getProperty("InvalidTimeoutValue");
		PropertyAlreadyExistsInOrderByCollection = BUNDLE.getProperty("PropertyAlreadyExistsInOrderByCollection");
		StartTimeZoneRequired = BUNDLE.getProperty("StartTimeZoneRequired");
		UnsupportedWebProtocol = BUNDLE.getProperty("UnsupportedWebProtocol");
		EqualityComparisonFilterIsInvalid = BUNDLE.getProperty("EqualityComparisonFilterIsInvalid");
		LoadingThisObjectTypeNotSupported = BUNDLE.getProperty("LoadingThisObjectTypeNotSupported");
		ValuePropertyNotAssigned = BUNDLE.getProperty("ValuePropertyNotAssigned");
		FolderPermissionLevelMustBeSet = BUNDLE.getProperty("FolderPermissionLevelMustBeSet");
		EndDateMustBeGreaterThanStartDate = BUNDLE.getProperty("EndDateMustBeGreaterThanStartDate");
		InvalidOrderBy = BUNDLE.getProperty("InvalidOrderBy");
		ElementValueCannotBeSerialized = BUNDLE.getProperty("ElementValueCannotBeSerialized");
		InvalidAttributeValue = BUNDLE.getProperty("InvalidAttributeValue");
		InvalidUser = BUNDLE.getProperty("InvalidUser");
		MinuteMustBeBetween0And59 = BUNDLE.getProperty("MinuteMustBeBetween0And59");
		CredentialsRequired = BUNDLE.getProperty("CredentialsRequired");
		AdditionalPropertyIsNull = BUNDLE.getProperty("AdditionalPropertyIsNull");
		DeleteInvalidForUnsavedUserConfiguration = BUNDLE.getProperty("DeleteInvalidForUnsavedUserConfiguration");
		CannotUpdateNewUserConfiguration = BUNDLE.getProperty("CannotUpdateNewUserConfiguration");
		PropertyDefinitionPropertyMustBeSet = BUNDLE.getProperty("PropertyDefinitionPropertyMustBeSet");
		IdAlreadyInList = BUNDLE.getProperty("IdAlreadyInList");
		ObjectTypeIncompatibleWithRequestVersion = BUNDLE.getProperty("ObjectTypeIncompatibleWithRequestVersion");
		InvalidEmailAddress = BUNDLE.getProperty("InvalidEmailAddress");
		InvalidAutodiscoverDomain = BUNDLE.getProperty("InvalidAutodiscoverDomain");
		ItemAttachmentMustBeNamed = BUNDLE.getProperty("ItemAttachmentMustBeNamed");
		ArrayMustHaveSingleDimension = BUNDLE.getProperty("ArrayMustHaveSingleDimension");
		DayOfWeekIndexMustBeSpecifiedForRecurrencePattern = BUNDLE.getProperty("DayOfWeekIndexMustBeSpecifiedForRecurrencePattern");
		InvalidRecurrencePattern = BUNDLE.getProperty("InvalidRecurrencePattern");
		ItemIsOutOfDate = BUNDLE.getProperty("ItemIsOutOfDate");
		AutodiscoverInvalidSettingForOutlookProvider = BUNDLE.getProperty("AutodiscoverInvalidSettingForOutlookProvider");
		MinutesMustBeBetween0And1439 = BUNDLE.getProperty("MinutesMustBeBetween0And1439");
		MaxChangesMustBeBetween1And512 = BUNDLE.getProperty("MaxChangesMustBeBetween1And512");
		InvalidDomainName = BUNDLE.getProperty("InvalidDomainName");
		ServiceObjectAlreadyHasId = BUNDLE.getProperty("ServiceObjectAlreadyHasId");
		ParameterIncompatibleWithRequestVersion = BUNDLE.getProperty("ParameterIncompatibleWithRequestVersion");
		RecurrencePatternMustHaveStartDate = BUNDLE.getProperty("RecurrencePatternMustHaveStartDate");
		ServiceResponseDoesNotContainXml = BUNDLE.getProperty("ServiceResponseDoesNotContainXml");
		FrequencyMustBeBetween1And1440 = BUNDLE.getProperty("FrequencyMustBeBetween1And1440");
		UnexpectedEndOfXmlDocument = BUNDLE.getProperty("UnexpectedEndOfXmlDocument");
		TimeoutMustBeGreaterThanZero = BUNDLE.getProperty("TimeoutMustBeGreaterThanZero");
		DurationMustBeSpecifiedWhenScheduled = BUNDLE.getProperty("DurationMustBeSpecifiedWhenScheduled");
		InvalidPropertyValueNotInRange = BUNDLE.getProperty("InvalidPropertyValueNotInRange");
		RegenerationPatternsOnlyValidForTasks = BUNDLE.getProperty("RegenerationPatternsOnlyValidForTasks");
		IEnumerableDoesNotContainThatManyObject = BUNDLE.getProperty("IEnumerableDoesNotContainThatManyObject");
		WLIDCredentialsCannotBeUsedWithLegacyAutodiscover = BUNDLE.getProperty("WLIDCredentialsCannotBeUsedWithLegacyAutodiscover");
		TooFewServiceReponsesReturned = BUNDLE.getProperty("TooFewServiceReponsesReturned");
		IntervalMustBeGreaterOrEqualToOne = BUNDLE.getProperty("IntervalMustBeGreaterOrEqualToOne");
		AutodiscoverServiceRequestRequiresDomainOrUrl = BUNDLE.getProperty("AutodiscoverServiceRequestRequiresDomainOrUrl");
		DayOfMonthMustBeBetween1And31 = BUNDLE.getProperty("DayOfMonthMustBeBetween1And31");
		ValueCannotBeConverted = BUNDLE.getProperty("ValueCannotBeConverted");
		SearchFilterMustBeSet = BUNDLE.getProperty("SearchFilterMustBeSet");
		CannotSetPermissionLevelToCustom = BUNDLE.getProperty("CannotSetPermissionLevelToCustom");
		PropertyIncompatibleWithRequestVersion = BUNDLE.getProperty("PropertyIncompatibleWithRequestVersion");
		PropertyDefinitionTypeMismatch = BUNDLE.getProperty("PropertyDefinitionTypeMismatch");
		AutodiscoverRedirectBlocked = BUNDLE.getProperty("AutodiscoverRedirectBlocked");
		ExpectedStartElement = BUNDLE.getProperty("ExpectedStartElement");
		InvalidFrequencyValue = BUNDLE.getProperty("InvalidFrequencyValue");
		CannotSubscribeToStatusEvents = BUNDLE.getProperty("CannotSubscribeToStatusEvents");
		TimeoutMustBeBetween1And1440 = BUNDLE.getProperty("TimeoutMustBeBetween1And1440");
		ValidationFailed = BUNDLE.getProperty("ValidationFailed");
		NumberOfOccurrencesMustBeGreaterThanZero = BUNDLE.getProperty("NumberOfOccurrencesMustBeGreaterThanZero");
		DelegateUserHasInvalidUserId = BUNDLE.getProperty("DelegateUserHasInvalidUserId");
		OccurrenceIndexMustBeGreaterThanZero = BUNDLE.getProperty("OccurrenceIndexMustBeGreaterThanZero");
		InvalidElementStringValue = BUNDLE.getProperty("InvalidElementStringValue");
		UnexpectedElementType = BUNDLE.getProperty("UnexpectedElementType");
		IncompatibleTypeForArray = BUNDLE.getProperty("IncompatibleTypeForArray");
		CannotCallDisconnectWithNoLiveConnection = BUNDLE.getProperty("CannotCallDisconnectWithNoLiveConnection");
		AutodiscoverDidNotReturnEwsUrl = BUNDLE.getProperty("AutodiscoverDidNotReturnEwsUrl");
		AutodiscoverError = BUNDLE.getProperty("AutodiscoverError");
		MustLoadOrAssignPropertyBeforeAccess = BUNDLE.getProperty("MustLoadOrAssignPropertyBeforeAccess");
		CollectionIsEmpty = BUNDLE.getProperty("CollectionIsEmpty");
		PropertyValueMustBeSpecifiedForRecurrencePattern = BUNDLE.getProperty("PropertyValueMustBeSpecifiedForRecurrencePattern");
		InvalidOrUnsupportedTimeZoneDefinition = BUNDLE.getProperty("InvalidOrUnsupportedTimeZoneDefinition");
		AttachmentCannotBeUpdated = BUNDLE.getProperty("AttachmentCannotBeUpdated");
		PercentCompleteMustBeBetween0And100 = BUNDLE.getProperty("PercentCompleteMustBeBetween0And100");
		CannotAddSubscriptionToLiveConnection = BUNDLE.getProperty("CannotAddSubscriptionToLiveConnection");
		MaximumRedirectionHopsExceeded = BUNDLE.getProperty("MaximumRedirectionHopsExceeded");
		PropertySetCannotBeModified = BUNDLE.getProperty("PropertySetCannotBeModified");
		PropertyIsReadOnly = BUNDLE.getProperty("PropertyIsReadOnly");
		ZeroLengthArrayInvalid = BUNDLE.getProperty("ZeroLengthArrayInvalid");
		ServerErrorAndStackTraceDetails = BUNDLE.getProperty("ServerErrorAndStackTraceDetails");
		CurrentPositionNotElementStart = BUNDLE.getProperty("CurrentPositionNotElementStart");
		ArrayMustHaveAtLeastOneElement = BUNDLE.getProperty("ArrayMustHaveAtLeastOneElement");
		NullStringArrayElementInvalid = BUNDLE.getProperty("NullStringArrayElementInvalid");
		TagValueIsOutOfRange = BUNDLE.getProperty("TagValueIsOutOfRange");
		ElementNotFound = BUNDLE.getProperty("ElementNotFound");
		NonSummaryPropertyCannotBeUsed = BUNDLE.getProperty("NonSummaryPropertyCannotBeUsed");
		AutodiscoverCouldNotBeLocated = BUNDLE.getProperty("AutodiscoverCouldNotBeLocated");
		InvalidRedirectionResponseReturned = BUNDLE.getProperty("InvalidRedirectionResponseReturned");
		InvalidMailboxType = BUNDLE.getProperty("InvalidMailboxType");
		PeriodNotFound = BUNDLE.getProperty("PeriodNotFound");
		CannotSetDelegateFolderPermissionLevelToCustom = BUNDLE.getProperty("CannotSetDelegateFolderPermissionLevelToCustom");
		ValuePropertyMustBeSet = BUNDLE.getProperty("ValuePropertyMustBeSet");
		ArgumentIsBlankString = BUNDLE.getProperty("ArgumentIsBlankString");
		IdPropertyMustBeSet = BUNDLE.getProperty("IdPropertyMustBeSet");
		XsDurationCouldNotBeParsed = BUNDLE.getProperty("XsDurationCouldNotBeParsed");
		CannotRemoveSubscriptionFromLiveConnection = BUNDLE.getProperty("CannotRemoveSubscriptionFromLiveConnection");
		NoAppropriateConstructorForItemClass = BUNDLE.getProperty("NoAppropriateConstructorForItemClass");
		FileAttachmentContentIsNotSet = BUNDLE.getProperty("FileAttachmentContentIsNotSet");
		AttachmentCollectionNotLoaded = BUNDLE.getProperty("AttachmentCollectionNotLoaded");
		OperationDoesNotSupportAttachments = BUNDLE.getProperty("OperationDoesNotSupportAttachments");
		ObjectTypeNotSupported = BUNDLE.getProperty("ObjectTypeNotSupported");
		ItemToUpdateCannotBeNullOrNew = BUNDLE.getProperty("ItemToUpdateCannotBeNullOrNew");
		ReadAccessInvalidForNonCalendarFolder = BUNDLE.getProperty("ReadAccessInvalidForNonCalendarFolder");
		UnsupportedTimeZonePeriodTransitionTarget = BUNDLE.getProperty("UnsupportedTimeZonePeriodTransitionTarget");
		InvalidAutodiscoverRequest = BUNDLE.getProperty("InvalidAutodiscoverRequest");
		MergedFreeBusyIntervalMustBeSmallerThanTimeWindow = BUNDLE.getProperty("MergedFreeBusyIntervalMustBeSmallerThanTimeWindow");
		MaxScpHopsExceeded = BUNDLE.getProperty("MaxScpHopsExceeded");
		TransitionGroupNotFound = BUNDLE.getProperty("TransitionGroupNotFound");
		ServiceObjectDoesNotHaveId = BUNDLE.getProperty("ServiceObjectDoesNotHaveId");
		InvalidAutodiscoverServiceResponse = BUNDLE.getProperty("InvalidAutodiscoverServiceResponse");
		AtLeastOneAttachmentCouldNotBeDeleted = BUNDLE.getProperty("AtLeastOneAttachmentCouldNotBeDeleted");
		ServiceRequestFailed = BUNDLE.getProperty("ServiceRequestFailed");
		SecondMustBeBetween0And59 = BUNDLE.getProperty("SecondMustBeBetween0And59");
		SearchParametersRootFolderIdsEmpty = BUNDLE.getProperty("SearchParametersRootFolderIdsEmpty");
		CannotConvertBetweenTimeZones = BUNDLE.getProperty("CannotConvertBetweenTimeZones");
		FolderTypeNotCompatible = BUNDLE.getProperty("FolderTypeNotCompatible");
		EnumValueIncompatibleWithRequestVersion = BUNDLE.getProperty("EnumValueIncompatibleWithRequestVersion");
		UserIdForDelegateUserNotSpecified = BUNDLE.getProperty("UserIdForDelegateUserNotSpecified");
		AttributeValueCannotBeSerialized = BUNDLE.getProperty("AttributeValueCannotBeSerialized");
		ContactGroupMemberCannotBeUpdatedWithoutBeingLoadedFirst = BUNDLE.getProperty("ContactGroupMemberCannotBeUpdatedWithoutBeingLoadedFirst");
		HourMustBeBetween0And23 = BUNDLE.getProperty("HourMustBeBetween0And23");
		MonthMustBeSpecifiedForRecurrencePattern = BUNDLE.getProperty("MonthMustBeSpecifiedForRecurrencePattern");
		NoError = BUNDLE.getProperty("NoError");
		PermissionLevelInvalidForNonCalendarFolder = BUNDLE.getProperty("PermissionLevelInvalidForNonCalendarFolder");
		InvalidDateTime = BUNDLE.getProperty("InvalidDateTime");
		PropertyCannotBeUpdated = BUNDLE.getProperty("PropertyCannotBeUpdated");
		InvalidAutodiscoverDomainsCount = BUNDLE.getProperty("InvalidAutodiscoverDomainsCount");
		DaysOfTheWeekNotSpecified = BUNDLE.getProperty("DaysOfTheWeekNotSpecified");
		RequestIncompatibleWithRequestVersion = BUNDLE.getProperty("RequestIncompatibleWithRequestVersion");
		UpdateItemsDoesNotSupportNewOrUnchangedItems = BUNDLE.getProperty("UpdateItemsDoesNotSupportNewOrUnchangedItems");
		CannotAddRequestHeader = BUNDLE.getProperty("CannotAddRequestHeader");
		ParentFolderDoesNotHaveId = BUNDLE.getProperty("ParentFolderDoesNotHaveId");
		DayOfTheWeekMustBeSpecifiedForRecurrencePattern = BUNDLE.getProperty("DayOfTheWeekMustBeSpecifiedForRecurrencePattern");
		ServerVersionNotSupported = BUNDLE.getProperty("ServerVersionNotSupported");
		NewMessagesWithAttachmentsCannotBeSentDirectly = BUNDLE.getProperty("NewMessagesWithAttachmentsCannotBeSentDirectly");
		SearchFilterAtIndexIsInvalid = BUNDLE.getProperty("SearchFilterAtIndexIsInvalid");
		ItemTypeNotCompatible = BUNDLE.getProperty("ItemTypeNotCompatible");
		ClassIncompatibleWithRequestVersion = BUNDLE.getProperty("ClassIncompatibleWithRequestVersion");
		UpdateItemsDoesNotAllowAttachments = BUNDLE.getProperty("UpdateItemsDoesNotAllowAttachments");
		UnknownTimeZonePeriodTransitionType = BUNDLE.getProperty("UnknownTimeZonePeriodTransitionType");
		FolderToUpdateCannotBeNullOrNew = BUNDLE.getProperty("FolderToUpdateCannotBeNullOrNew");
		FolderPermissionHasInvalidUserId = BUNDLE.getProperty("FolderPermissionHasInvalidUserId");
		AutodiscoverServiceIncompatibleWithRequestVersion = BUNDLE.getProperty("AutodiscoverServiceIncompatibleWithRequestVersion");
		InvalidAutodiscoverSettingsCount = BUNDLE.getProperty("InvalidAutodiscoverSettingsCount");
		AttachmentCreationFailed = BUNDLE.getProperty("AttachmentCreationFailed");
		ValuePropertyNotLoaded = BUNDLE.getProperty("ValuePropertyNotLoaded");
		OffsetMustBeGreaterThanZero = BUNDLE.getProperty("OffsetMustBeGreaterThanZero");
		InvalidRecurrenceRange = BUNDLE.getProperty("InvalidRecurrenceRange");
		DayOfMonthMustBeSpecifiedForRecurrencePattern = BUNDLE.getProperty("DayOfMonthMustBeSpecifiedForRecurrencePattern");
		InvalidAutodiscoverSmtpAddress = BUNDLE.getProperty("InvalidAutodiscoverSmtpAddress");
	}
}
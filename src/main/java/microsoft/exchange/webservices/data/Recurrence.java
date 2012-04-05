/**************************************************************************
 * copyright file="Recurrence.java" company="Microsoft"
 *     Copyright (c) Microsoft Corporation.  All rights reserved.
 * 
 * Defines the Recurrence.java.
 **************************************************************************/
package microsoft.exchange.webservices.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.xml.stream.XMLStreamException;

/**
 * Represents a recurrence pattern, as used by Appointment and Task items.
 * 
 */
public abstract class Recurrence extends ComplexProperty {

	/** The start date. */
	private Date startDate;

	/** The number of occurrences. */
	private Integer numberOfOccurrences;

	/** The end date. */
	private Date endDate;

	/**
	 * Initializes a new instance.
	 */
	protected Recurrence() {
		super();
	}

	/**
	 * Initializes a new instance.
	 * 
	 * @param startDate
	 *            the start date
	 */
	protected Recurrence(Date startDate) {
		this();
		this.startDate = startDate;
	}

	/**
	 * Gets the name of the XML element.
	 * 
	 * @return the xml element name
	 */
	protected abstract String getXmlElementName();

	/**
	 * Gets a value indicating whether this instance is regeneration pattern.
	 * 
	 * @return true, if is regeneration pattern
	 */
	protected boolean isRegenerationPattern() {
		return false;
	}

	/**
	 * Write properties to XML.
	 * 
	 * @param writer
	 *            the writer
	 * @throws XMLStreamException
	 *             the xML stream exception
	 * @throws ServiceXmlSerializationException
	 *             the service xml serialization exception
	 * @throws ServiceValidationException
	 *             the service validation exception
	 * @throws Exception
	 *             the exception
	 */
	protected void internalWritePropertiesToXml(EwsServiceXmlWriter writer)
			throws XMLStreamException, ServiceXmlSerializationException,
			ServiceValidationException, Exception {}

	/**
	 * Writes elements to XML.
	 * 
	 * @param writer
	 *            the writer
	 * @throws Exception
	 *             the exception
	 */
	@Override
	protected final void writeElementsToXml(EwsServiceXmlWriter writer)
			throws Exception {
		writer.writeStartElement(XmlNamespace.Types, getXmlElementName());
		internalWritePropertiesToXml(writer);
		writer.writeEndElement();

		RecurrenceRange range = null;

		if (!hasEnd()) {
			range = new NoEndRecurrenceRange(getStartDate());
		} else if (getNumberOfOccurrences() != null) {
			range = new NumberedRecurrenceRange(startDate,
					numberOfOccurrences);
		} else {
			if (getEndDate() != null) {
				range = new EndDateRecurrenceRange(getStartDate(), getEndDate());
			}
		}
		if (range != null) {
			range.writeToXml(writer, range.getXmlElementName());
		}

	}

	/**
	 * Gets a property value or throw if null. *
	 * 
	 * @param <T>
	 *            the generic type
	 * @param cls
	 *            the cls
	 * @param value
	 *            the value
	 * @param name
	 *            the name
	 * @return Property value
	 * @throws ServiceValidationException
	 *             the service validation exception
	 */
	protected <T> T getFieldValueOrThrowIfNull(Class<T> cls, Object value,
			String name) throws ServiceValidationException {
		if (value != null) {
			return (T) value;
		} else {
			throw new ServiceValidationException(String.format(
					Strings.PropertyValueMustBeSpecifiedForRecurrencePattern,
					name));
		}
	}

	/**
	 * Gets the date and time when the recurrence start.
	 * 
	 * @return Date
	 * @throws ServiceValidationException
	 *             the service validation exception
	 */
	public Date getStartDate() throws ServiceValidationException {
		return this.getFieldValueOrThrowIfNull(Date.class, startDate,
				"StartDate");

	}

	/**
	 * sets the date and time when the recurrence start.
	 * 
	 * @param value
	 *            the new start date
	 */
	public void setStartDate(Date value) {
		startDate = value;
	}

	/**
	 * Gets a value indicating whether the pattern has a fixed number of occurrences or an end date.
	 * 
	 * @return boolean
	 */
	public boolean hasEnd() {

		return ((numberOfOccurrences != null) || (endDate != null));
	}

	/**
	 * Sets up this recurrence so that it never ends. Calling NeverEnds is equivalent to setting both NumberOfOccurrences and EndDate to null.
	 * 
	 */
	public void neverEnds() {
		numberOfOccurrences = null;
		endDate = null;
		changed();
	}

	/**
	 * Validates this instance.
	 * 
	 * @throws Exception
	 */
	@Override
	protected void internalValidate() throws Exception {
		super.internalValidate();

		if (startDate == null) {
			throw new ServiceValidationException(
					Strings.RecurrencePatternMustHaveStartDate);
		}
	}

	/**
	 * Gets the number of occurrences after which the recurrence ends. Setting NumberOfOccurrences resets EndDate.
	 * 
	 * @return the number of occurrences
	 */
	public Integer getNumberOfOccurrences() {
		return numberOfOccurrences;

	}

	/**
	 * Gets the number of occurrences after which the recurrence ends. Setting NumberOfOccurrences resets EndDate.
	 * 
	 * @param value
	 *            the new number of occurrences
	 * @throws ArgumentException
	 *             the argument exception
	 */
	public void setNumberOfOccurrences(Integer value) throws ArgumentException {
		if (value < 1) {
			throw new ArgumentException(
					Strings.NumberOfOccurrencesMustBeGreaterThanZero);
		}

		if (this.canSetFieldValue(numberOfOccurrences, value)) {
			numberOfOccurrences = value;
			changed();
		}

		endDate = null;

	}

	/**
	 * Gets the date after which the recurrence ends. Setting EndDate resets NumberOfOccurrences.
	 * 
	 * @return the end date
	 */
	public Date getEndDate() {

		return endDate;
	}

	/**
	 * sets the date after which the recurrence ends. Setting EndDate resets NumberOfOccurrences.
	 * 
	 * @param value
	 *            the new end date
	 */
	public void setEndDate(Date value) {

		if (this.canSetFieldValue(endDate, value)) {
			endDate = value;
			changed();
		}

		numberOfOccurrences = null;

	}

	/**
	 * Represents a recurrence pattern where each occurrence happens a specific number of days after the previous one.
	 * 
	 */
	public final static class DailyPattern extends IntervalPattern {

		/**
		 * Gets the name of the XML element.
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.DailyRecurrence;
		}

		/**
		 * Initializes a new instance of the DailyPattern class.
		 */

		public DailyPattern() {
			super();
		}

		/**
		 * Initializes a new instance of the DailyPattern class.
		 * 
		 * @param startDate
		 *            The date and time when the recurrence starts.
		 * @param interval
		 *            The number of days between each occurrence.
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public DailyPattern(Date startDate, int interval)
				throws ArgumentOutOfRangeException {
			super(startDate, interval);
		}

	}

	/**
	 * 
	 * Represents a regeneration pattern, as used with recurring tasks, where each occurrence happens a specified number of days after the previous one is
	 * completed.
	 * 
	 */

	public final static class DailyRegenerationPattern extends IntervalPattern {

		/**
		 * Initializes a new instance of the DailyRegenerationPattern class.
		 */
		public DailyRegenerationPattern() {
			super();
		}

		/**
		 * Initializes a new instance of the DailyRegenerationPattern class.
		 * 
		 * @param startDate
		 *            The date and time when the recurrence starts.
		 * @param interval
		 *            The number of days between each occurrence.
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public DailyRegenerationPattern(Date startDate, int interval)
				throws ArgumentOutOfRangeException {
			super(startDate, interval);

		}

		/**
		 * Gets the name of the XML element.
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.DailyRegeneration;
		}

		/**
		 * Gets a value indicating whether this instance is a regeneration pattern.
		 * 
		 * @return true, if is regeneration pattern
		 */
		@Override
		protected boolean isRegenerationPattern() {
			return true;
		}

	}

	/**
	 * Represents a recurrence pattern where each occurrence happens at a specific interval after the previous one.
	 * [EditorBrowsable(EditorBrowsableState.Never)]
	 */
	@EditorBrowsable(state = EditorBrowsableState.Never)
	public abstract static class IntervalPattern extends Recurrence {

		/** The interval. */
		private int interval = 1;

		/**
		 * Initializes a new instance of the IntervalPattern class.
		 */
		protected IntervalPattern() {
			super();
		}

		/**
		 * Initializes a new instance of the IntervalPattern class.
		 * 
		 * @param startDate
		 *            The date and time when the recurrence starts.
		 * @param interval
		 *            The number of days between each occurrence.
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		protected IntervalPattern(Date startDate, int interval)
				throws ArgumentOutOfRangeException {

			super(startDate);
			if (interval < 1) {
				throw new ArgumentOutOfRangeException("interval",
						Strings.IntervalMustBeGreaterOrEqualToOne);
			}

			setInterval(interval);
		}

		/**
		 * Write properties to XML.
		 * 
		 * @param writer
		 *            the writer
		 * @throws XMLStreamException
		 *             the xML stream exception
		 * @throws ServiceXmlSerializationException
		 *             the service xml serialization exception
		 * @throws ServiceValidationException
		 *             the service validation exception
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected void internalWritePropertiesToXml(EwsServiceXmlWriter writer)
				throws XMLStreamException, ServiceXmlSerializationException,
				ServiceValidationException, Exception {
			super.internalWritePropertiesToXml(writer);

			writer.writeElementValue(XmlNamespace.Types,
					XmlElementNames.Interval, getInterval());
		}

		/**
		 * Tries to read element from XML.
		 * 
		 * @param reader
		 *            the reader
		 * @return true, if successful
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected boolean tryReadElementFromXml(EwsServiceXmlReader reader)
				throws Exception {
			if (super.tryReadElementFromXml(reader)) {
				return true;
			} else {

				if (reader.getLocalName().equals(XmlElementNames.Interval)) {
					interval = reader.readElementValue(Integer.class);
					return true;
				} else {
					return false;
				}
			}
		}

		/**
		 * Gets the interval between occurrences.
		 * 
		 * @return the interval
		 */
		public int getInterval() {
			return interval;
		}

		/**
		 * Sets the interval.
		 * 
		 * @param value
		 *            the new interval
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public void setInterval(int value) throws ArgumentOutOfRangeException {

			if (value < 1) {
				throw new ArgumentOutOfRangeException("value",
						Strings.IntervalMustBeGreaterOrEqualToOne);
			}

			if (this.canSetFieldValue(interval, value)) {
				interval = value;
				changed();
			}

		}

	}

	/**
	 * Represents a recurrence pattern where each occurrence happens on a specific day a specific number of months after the previous one.
	 */

	public final static class MonthlyPattern extends IntervalPattern {

		/** The day of month. */
		private Integer dayOfMonth;

		/**
		 * Initializes a new instance of the MonthlyPattern class.
		 */
		public MonthlyPattern() {
			super();

		}

		/**
		 * Initializes a new instance of the MonthlyPattern class.
		 * 
		 * @param startDate
		 *            the start date
		 * @param interval
		 *            the interval
		 * @param dayOfMonth
		 *            the day of month
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public MonthlyPattern(Date startDate, int interval, int dayOfMonth)
				throws ArgumentOutOfRangeException {
			super(startDate, interval);

			setDayOfMonth(dayOfMonth);
		}

		// / Gets the name of the XML element.

		/*
		 * (non-Javadoc)
		 * 
		 * @see microsoft.exchange.webservices.Recurrence#getXmlElementName()
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.AbsoluteMonthlyRecurrence;
		}

		/**
		 * Write properties to XML.
		 * 
		 * @param writer
		 *            the writer
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected void internalWritePropertiesToXml(EwsServiceXmlWriter writer)
				throws Exception {
			super.internalWritePropertiesToXml(writer);

			writer.writeElementValue(XmlNamespace.Types,
					XmlElementNames.DayOfMonth, getDayOfMonth());
		}

		/**
		 * Tries to read element from XML.
		 * 
		 * @param reader
		 *            the reader
		 * @return True if appropriate element was read.
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected boolean tryReadElementFromXml(EwsServiceXmlReader reader)
				throws Exception {
			if (super.tryReadElementFromXml(reader)) {
				return true;
			} else {
				if (reader.getLocalName().equals(XmlElementNames.DayOfMonth)) {
					dayOfMonth = reader.readElementValue(int.class);
					return true;
				} else {
					return false;
				}
			}
		}

		/**
		 * Validates this instance.
		 * 
		 * @throws Exception
		 */
		@Override
		protected void internalValidate() throws Exception {
			super.internalValidate();

			if (dayOfMonth == null) {
				throw new ServiceValidationException(
						Strings.DayOfMonthMustBeBetween1And31);
			}
		}

		/**
		 * Gets the day of month.
		 * 
		 * @return the day of month
		 * @throws ServiceValidationException
		 *             the service validation exception
		 */
		public int getDayOfMonth() throws ServiceValidationException {
			return this.getFieldValueOrThrowIfNull(int.class, dayOfMonth,
					"DayOfMonth");

		}

		/**
		 * Sets the day of month.
		 * 
		 * @param value
		 *            the new day of month
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public void setDayOfMonth(int value)
				throws ArgumentOutOfRangeException {
			if (value < 1 || value > 31) {
				throw new ArgumentOutOfRangeException("DayOfMonth",
						Strings.DayOfMonthMustBeBetween1And31);
			}

			if (this.canSetFieldValue(dayOfMonth, value)) {
				dayOfMonth = value;
				changed();
			}
		}
	}

	/**
	 * Represents a regeneration pattern, as used with recurring tasks, where each occurrence happens a specified number of months after the previous one is
	 * completed.
	 */
	public final static class MonthlyRegenerationPattern extends
			IntervalPattern {

		/**
		 * Instantiates a new monthly regeneration pattern.
		 */
		public MonthlyRegenerationPattern() {
			super();

		}

		/**
		 * Instantiates a new monthly regeneration pattern.
		 * 
		 * @param startDate
		 *            the start date
		 * @param interval
		 *            the interval
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public MonthlyRegenerationPattern(Date startDate, int interval)
				throws ArgumentOutOfRangeException {
			super(startDate, interval);

		}

		/**
		 * Gets the name of the XML element. <value>The name of the XML element.</value>
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.MonthlyRegeneration;
		}

		/**
		 * Gets a value indicating whether this instance is regeneration pattern. <value> <c>true</c> if this instance is regeneration pattern; otherwise,
		 * <c>false</c>. </value>
		 * 
		 * @return true, if is regeneration pattern
		 */
		@Override
		protected boolean isRegenerationPattern() {
			return true;
		}
	}

	/**
	 * Represents a recurrence pattern where each occurrence happens on a relative day a specific number of months after the previous one.
	 */
	public final static class RelativeMonthlyPattern extends IntervalPattern {

		/** The day of the week. */
		private DayOfTheWeek dayOfTheWeek;

		/** The day of the week index. */
		private DayOfTheWeekIndex dayOfTheWeekIndex;

		// / Initializes a new instance of the <see
		// cref="RelativeMonthlyPattern"/> class.

		/**
		 * Instantiates a new relative monthly pattern.
		 */
		public RelativeMonthlyPattern() {
			super();
		}

		/**
		 * Instantiates a new relative monthly pattern.
		 * 
		 * @param startDate
		 *            the start date
		 * @param interval
		 *            the interval
		 * @param dayOfTheWeek
		 *            the day of the week
		 * @param dayOfTheWeekIndex
		 *            the day of the week index
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public RelativeMonthlyPattern(Date startDate, int interval,
				DayOfTheWeek dayOfTheWeek, DayOfTheWeekIndex dayOfTheWeekIndex)
				throws ArgumentOutOfRangeException {
			super(startDate, interval);

			setDayOfTheWeek(dayOfTheWeek);
			setDayOfTheWeekIndex(dayOfTheWeekIndex);
		}

		/**
		 * Gets the name of the XML element.
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.RelativeMonthlyRecurrence;
		}

		/**
		 * Write properties to XML.
		 * 
		 * @param writer
		 *            the writer
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected void internalWritePropertiesToXml(EwsServiceXmlWriter writer)
				throws Exception {
			super.internalWritePropertiesToXml(writer);

			writer.writeElementValue(XmlNamespace.Types,
					XmlElementNames.DaysOfWeek, getDayOfTheWeek());

			writer
					.writeElementValue(XmlNamespace.Types,
							XmlElementNames.DayOfWeekIndex, getDayOfTheWeekIndex());
		}

		/**
		 * Tries to read element from XML.
		 * 
		 * @param reader
		 *            the reader
		 * @return True if appropriate element was read.
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected boolean tryReadElementFromXml(EwsServiceXmlReader reader)
				throws Exception {
			if (super.tryReadElementFromXml(reader)) {
				return true;
			} else {
				if (reader.getLocalName().equals(XmlElementNames.DaysOfWeek)) {

					dayOfTheWeek = reader
							.readElementValue(DayOfTheWeek.class);
					return true;
				} else if (reader.getLocalName().equals(
						XmlElementNames.DayOfWeekIndex)) {

					dayOfTheWeekIndex = reader
							.readElementValue(DayOfTheWeekIndex.class);
					return true;
				} else {

					return false;
				}
			}
		}

		/**
		 * Validates this instance.
		 * 
		 * @throws Exception
		 */
		@Override
		protected void internalValidate() throws Exception {
			super.internalValidate();

			if (dayOfTheWeek == null) {
				throw new ServiceValidationException(
						Strings.DayOfTheWeekMustBeSpecifiedForRecurrencePattern);
			}

			if (dayOfTheWeekIndex == null) {
				throw new ServiceValidationException(
						Strings.DayOfWeekIndexMustBeSpecifiedForRecurrencePattern);
			}
		}

		/**
		 * Day of the week index.
		 * 
		 * @return the day of the week index
		 * @throws ServiceValidationException
		 *             the service validation exception
		 */
		public DayOfTheWeekIndex getDayOfTheWeekIndex()
				throws ServiceValidationException {
			return this.getFieldValueOrThrowIfNull(DayOfTheWeekIndex.class,
					dayOfTheWeekIndex, "DayOfTheWeekIndex");
		}

		/**
		 * Day of the week index.
		 * 
		 * @param value
		 *            the value
		 */
		public void setDayOfTheWeekIndex(DayOfTheWeekIndex value) {
			if (this.canSetFieldValue(dayOfTheWeekIndex, value)) {
				dayOfTheWeekIndex = value;
				changed();
			}

		}

		/**
		 * Gets the day of the week.
		 * 
		 * @return the day of the week
		 * @throws ServiceValidationException
		 *             the service validation exception
		 */
		public DayOfTheWeek getDayOfTheWeek()
				throws ServiceValidationException {
			return this.getFieldValueOrThrowIfNull(DayOfTheWeek.class,
					dayOfTheWeek, "DayOfTheWeek");

		}

		/**
		 * Sets the day of the week.
		 * 
		 * @param value
		 *            the new day of the week
		 */
		public void setDayOfTheWeek(DayOfTheWeek value) {

			if (this.canSetFieldValue(dayOfTheWeek, value)) {
				dayOfTheWeek = value;
				changed();
			}
		}
	}

	/**
	 * The Class RelativeYearlyPattern.
	 */
	public final static class RelativeYearlyPattern extends Recurrence {

		/** The day of the week. */
		private DayOfTheWeek dayOfTheWeek;

		/** The day of the week index. */
		private DayOfTheWeekIndex dayOfTheWeekIndex;

		/** The month. */
		private Month month;

		/**
		 * Gets the name of the XML element. <value>The name of the XML element.</value>
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.RelativeYearlyRecurrence;
		}

		/**
		 * Write properties to XML.
		 * 
		 * @param writer
		 *            the writer
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected void internalWritePropertiesToXml(EwsServiceXmlWriter writer)
				throws Exception {
			super.internalWritePropertiesToXml(writer);

			writer.writeElementValue(XmlNamespace.Types,
					XmlElementNames.DaysOfWeek, dayOfTheWeek);

			writer.writeElementValue(XmlNamespace.Types,
					XmlElementNames.DayOfWeekIndex, dayOfTheWeekIndex);

			writer.writeElementValue(XmlNamespace.Types, XmlElementNames.Month,
					month);
		}

		/**
		 * Tries to read element from XML.
		 * 
		 * @param reader
		 *            the reader
		 * @return True if element was read.
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected boolean tryReadElementFromXml(EwsServiceXmlReader reader)
				throws Exception {
			if (super.tryReadElementFromXml(reader)) {
				return true;
			} else {
				if (reader.getLocalName().equals(XmlElementNames.DaysOfWeek)) {

					dayOfTheWeek = reader
							.readElementValue(DayOfTheWeek.class);
					return true;
				} else if (reader.getLocalName().equals(
						XmlElementNames.DayOfWeekIndex)) {

					dayOfTheWeekIndex = reader
							.readElementValue(DayOfTheWeekIndex.class);
					return true;
				} else if (reader.getLocalName().equals(XmlElementNames.Month)) {

					month = reader.readElementValue(Month.class);
					return true;
				} else {

					return false;
				}
			}
		}

		/**
		 * Instantiates a new relative yearly pattern.
		 */
		public RelativeYearlyPattern() {
			super();

		}

		/**
		 * Instantiates a new relative yearly pattern.
		 * 
		 * @param startDate
		 *            the start date
		 * @param month
		 *            the month
		 * @param dayOfTheWeek
		 *            the day of the week
		 * @param dayOfTheWeekIndex
		 *            the day of the week index
		 */
		public RelativeYearlyPattern(Date startDate, Month month,
				DayOfTheWeek dayOfTheWeek,
				DayOfTheWeekIndex dayOfTheWeekIndex) {
			super(startDate);

			this.month = month;
			this.dayOfTheWeek = dayOfTheWeek;
			this.dayOfTheWeekIndex = dayOfTheWeekIndex;
		}

		/**
		 * Validates this instance.
		 * 
		 * @throws Exception
		 */
		@Override
		protected void internalValidate() throws Exception {
			super.internalValidate();

			if (dayOfTheWeekIndex == null) {
				throw new ServiceValidationException(
						Strings.DayOfWeekIndexMustBeSpecifiedForRecurrencePattern);
			}

			if (dayOfTheWeek == null) {
				throw new ServiceValidationException(
						Strings.DayOfTheWeekMustBeSpecifiedForRecurrencePattern);
			}

			if (month == null) {
				throw new ServiceValidationException(
						Strings.MonthMustBeSpecifiedForRecurrencePattern);
			}
		}

		/**
		 * Gets the relative position of the day specified in DayOfTheWeek within the month.
		 * 
		 * @return the day of the week index
		 * @throws ServiceValidationException
		 *             the service validation exception
		 */
		public DayOfTheWeekIndex getDayOfTheWeekIndex()
				throws ServiceValidationException {

			return this.getFieldValueOrThrowIfNull(DayOfTheWeekIndex.class,
					dayOfTheWeekIndex, "DayOfTheWeekIndex");
		}

		/**
		 * Sets the relative position of the day specified in DayOfTheWeek within the month.
		 * 
		 * @param value
		 *            the new day of the week index
		 */
		public void setDayOfTheWeekIndex(DayOfTheWeekIndex value) {

			if (this.canSetFieldValue(dayOfTheWeekIndex, value)) {
				dayOfTheWeekIndex = value;
				changed();
			}
		}

		/**
		 * Gets the day of the week.
		 * 
		 * @return the day of the week
		 * @throws ServiceValidationException
		 *             the service validation exception
		 */
		public DayOfTheWeek getDayOfTheWeek()
				throws ServiceValidationException {

			return this.getFieldValueOrThrowIfNull(DayOfTheWeek.class,
					dayOfTheWeek, "DayOfTheWeek");
		}

		/**
		 * Sets the day of the week.
		 * 
		 * @param value
		 *            the new day of the week
		 */
		public void setDayOfTheWeek(DayOfTheWeek value) {

			if (this.canSetFieldValue(dayOfTheWeek, value)) {
				dayOfTheWeek = value;
				changed();
			}
		}

		/**
		 * Gets the month.
		 * 
		 * @return the month
		 * @throws ServiceValidationException
		 *             the service validation exception
		 */
		public Month getMonth() throws ServiceValidationException {

			return this.getFieldValueOrThrowIfNull(Month.class, month,
					"Month");

		}

		/**
		 * Sets the month.
		 * 
		 * @param value
		 *            the new month
		 */
		public void setMonth(Month value) {

			if (this.canSetFieldValue(month, value)) {
				month = value;
				changed();
			}
		}
	}

	/**
	 * Represents a recurrence pattern where each occurrence happens on specific days a specific number of weeks after the previous one.
	 */
	public final static class WeeklyPattern extends IntervalPattern implements
			IComplexPropertyChangedDelegate {

		/** The days of the week. */
		private final DayOfTheWeekCollection daysOfTheWeek =
				new DayOfTheWeekCollection();

		private Calendar firstDayOfWeek;

		/**
		 * Initializes a new instance of the WeeklyPattern class. specific days a specific number of weeks after the previous one.
		 */
		public WeeklyPattern() {
			super();

			daysOfTheWeek.addOnChangeEvent(this);
		}

		/**
		 * Initializes a new instance of the WeeklyPattern class.
		 * 
		 * @param startDate
		 *            the start date
		 * @param interval
		 *            the interval
		 * @param daysOfTheWeek
		 *            the days of the week
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public WeeklyPattern(Date startDate, int interval,
				DayOfTheWeek... daysOfTheWeek)
				throws ArgumentOutOfRangeException {
			super(startDate, interval);

			ArrayList<DayOfTheWeek> toProcess = new ArrayList<DayOfTheWeek>(
					Arrays.asList(daysOfTheWeek));
			Iterator<DayOfTheWeek> idaysOfTheWeek = toProcess.iterator();
			this.daysOfTheWeek.addRange(idaysOfTheWeek);
		}

		/**
		 * Change event handler.
		 * 
		 * @param complexProperty
		 *            the complex property
		 */
		private void daysOfTheWeekChanged(ComplexProperty complexProperty) {
			changed();
		}

		/**
		 * Gets the name of the XML element. <value>The name of the XML element.</value>
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.WeeklyRecurrence;
		}

		/**
		 * Write properties to XML.
		 * 
		 * @param writer
		 *            the writer
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected void internalWritePropertiesToXml(EwsServiceXmlWriter writer)
				throws Exception {
			super.internalWritePropertiesToXml(writer);

			getDaysOfTheWeek().writeToXml(writer,
					XmlElementNames.DaysOfWeek);
			if (firstDayOfWeek != null)
			{

				EwsUtilities.validatePropertyVersion(
						(ExchangeService) writer.getService(),
						ExchangeVersion.Exchange2010_SP1,
						"FirstDayOfWeek");

				writer.writeElementValue(
						XmlNamespace.Types,
						XmlElementNames.FirstDayOfWeek,
						firstDayOfWeek);
			}

		}

		/**
		 * Tries to read element from XML.
		 * 
		 * @param reader
		 *            the reader
		 * @return True if appropriate element was read.
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected boolean tryReadElementFromXml(EwsServiceXmlReader reader)
				throws Exception {
			if (super.tryReadElementFromXml(reader)) {
				return true;
			} else {
				if (reader.getLocalName().equals(XmlElementNames.DaysOfWeek)) {

					getDaysOfTheWeek().loadFromXml(reader,
							reader.getLocalName());
					return true;
				}
				else if (reader.getLocalName().equals(XmlElementNames.FirstDayOfWeek)) {
					firstDayOfWeek = reader.
							readElementValue(Calendar.class,
									XmlNamespace.Types,
									XmlElementNames.FirstDayOfWeek);
					return true;
				} else {

					return false;
				}
			}
		}

		/**
		 * Validates this instance.
		 * 
		 * @throws Exception
		 */
		@Override
		protected void internalValidate() throws Exception {
			super.internalValidate();

			if (getDaysOfTheWeek().getCount() == 0) {
				throw new ServiceValidationException(
						Strings.DaysOfTheWeekNotSpecified);
			}
		}

		/**
		 * Gets the list of the days of the week when occurrences happen.
		 * 
		 * @return the days of the week
		 */
		public DayOfTheWeekCollection getDaysOfTheWeek() {
			return daysOfTheWeek;
		}

		public Calendar getFirstDayOfWeek() throws ServiceValidationException
		{
			return this.getFieldValueOrThrowIfNull(Calendar.class,
					firstDayOfWeek, "FirstDayOfWeek");
		}

		public void setFirstDayOfWeek(Calendar value)
		{
			if (this.canSetFieldValue(firstDayOfWeek, value)) {
				firstDayOfWeek = value;
				changed();
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * microsoft.exchange.webservices.
		 * ComplexPropertyChangedDelegateInterface# 
		 * complexPropertyChanged(microsoft.exchange.webservices.ComplexProperty
		 * )
		 */
		public void complexPropertyChanged(ComplexProperty complexProperty) {
			daysOfTheWeekChanged(complexProperty);
		}

	}

	/**
	 * Represents a regeneration pattern, as used with recurring tasks, where each occurrence happens a specified number of weeks after the previous one is
	 * completed.
	 */
	public final static class WeeklyRegenerationPattern extends
			IntervalPattern {

		/**
		 * Initializes a new instance of the WeeklyRegenerationPattern class.
		 */
		public WeeklyRegenerationPattern() {

			super();
		}

		/**
		 * Initializes a new instance of the WeeklyRegenerationPattern class.
		 * 
		 * @param startDate
		 *            the start date
		 * @param interval
		 *            the interval
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public WeeklyRegenerationPattern(Date startDate, int interval)
				throws ArgumentOutOfRangeException {
			super(startDate, interval);

		}

		/**
		 * Gets the name of the XML element. <value>The name of the XML element.</value>
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.WeeklyRegeneration;
		}

		/**
		 * Gets a value indicating whether this instance is regeneration pattern. <value> <c>true</c> if this instance is regeneration pattern; otherwise,
		 * <c>false</c>. </value>
		 * 
		 * @return true, if is regeneration pattern
		 */
		@Override
		protected boolean isRegenerationPattern() {
			return true;
		}
	}

	/**
	 * Represents a recurrence pattern where each occurrence happens on a specific day every year.
	 */
	public final static class YearlyPattern extends Recurrence {

		/** The month. */
		private Month month;

		/** The day of month. */
		private Integer dayOfMonth;

		/**
		 * Initializes a new instance of the YearlyPattern class.
		 */
		public YearlyPattern() {
			super();

		}

		/**
		 * Initializes a new instance of the YearlyPattern class.
		 * 
		 * @param startDate
		 *            the start date
		 * @param month
		 *            the month
		 * @param dayOfMonth
		 *            the day of month
		 */
		public YearlyPattern(Date startDate, Month month, int dayOfMonth) {
			super(startDate);

			this.month = month;
			this.dayOfMonth = dayOfMonth;
		}

		/**
		 * Gets the name of the XML element. <value>The name of the XML element.</value>
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.AbsoluteYearlyRecurrence;
		}

		/**
		 * Write properties to XML.
		 * 
		 * @param writer
		 *            the writer
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected void internalWritePropertiesToXml(EwsServiceXmlWriter writer)
				throws Exception {
			super.internalWritePropertiesToXml(writer);

			writer.writeElementValue(XmlNamespace.Types,
					XmlElementNames.DayOfMonth, getDayOfMonth());

			writer.writeElementValue(XmlNamespace.Types, XmlElementNames.Month,
					getMonth());
		}

		/**
		 * Tries to read element from XML.
		 * 
		 * @param reader
		 *            the reader
		 * @return True if element was read
		 * @throws Exception
		 *             the exception
		 */
		@Override
		protected boolean tryReadElementFromXml(EwsServiceXmlReader reader)
				throws Exception {
			if (super.tryReadElementFromXml(reader)) {
				return true;
			} else {
				if (reader.getLocalName().equals(XmlElementNames.DayOfMonth)) {

					dayOfMonth = reader.readElementValue(int.class);
					return true;
				} else if (reader.getLocalName().equals(XmlElementNames.Month)) {

					month = reader.readElementValue(Month.class);
					return true;
				} else {

					return false;
				}
			}
		}

		/**
		 * Validates this instance.
		 * 
		 * @throws Exception
		 */
		@Override
		protected void internalValidate() throws Exception {
			super.internalValidate();

			if (month == null) {
				throw new ServiceValidationException(
						Strings.MonthMustBeSpecifiedForRecurrencePattern);
			}

			if (dayOfMonth == null) {
				throw new ServiceValidationException(
						Strings.DayOfMonthMustBeSpecifiedForRecurrencePattern);
			}
		}

		/**
		 * Gets the month of the year when each occurrence happens.
		 * 
		 * @return the month
		 * @throws ServiceValidationException
		 *             the service validation exception
		 */
		public Month getMonth() throws ServiceValidationException {
			return this.getFieldValueOrThrowIfNull(Month.class, month,
					"Month");
		}

		/**
		 * Sets the month.
		 * 
		 * @param value
		 *            the new month
		 */
		public void setMonth(Month value) {

			if (this.canSetFieldValue(month, value)) {
				month = value;
				changed();
			}
		}

		/**
		 * Gets the day of the month when each occurrence happens. DayOfMonth must be between 1 and 31.
		 * 
		 * @return the day of month
		 * @throws ServiceValidationException
		 *             the service validation exception
		 */
		public int getDayOfMonth() throws ServiceValidationException {

			return this.getFieldValueOrThrowIfNull(int.class, dayOfMonth,
					"DayOfMonth");

		}

		/**
		 * Sets the day of the month when each occurrence happens. DayOfMonth must be between 1 and 31.
		 * 
		 * @param value
		 *            the new day of month
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public void setDayOfMonth(int value)
				throws ArgumentOutOfRangeException {

			if (value < 1 || value > 31) {
				throw new ArgumentOutOfRangeException("DayOfMonth",
						Strings.DayOfMonthMustBeBetween1And31);
			}

			if (this.canSetFieldValue(dayOfMonth, value)) {
				dayOfMonth = value;
				changed();
			}
		}
	}

	/**
	 * Represents a regeneration pattern, as used with recurring tasks, where each occurrence happens a specified number of years after the previous one is
	 * completed.
	 */
	public final static class YearlyRegenerationPattern extends
			IntervalPattern {

		/**
		 * Gets the name of the XML element. <value>The name of the XML element.</value>
		 * 
		 * @return the xml element name
		 */
		@Override
		protected String getXmlElementName() {
			return XmlElementNames.YearlyRegeneration;
		}

		/**
		 * Gets a value indicating whether this instance is regeneration pattern.
		 * 
		 * @return true, if is regeneration pattern
		 */
		@Override
		protected boolean isRegenerationPattern() {
			return true;
		}

		/**
		 * Initializes a new instance of the YearlyRegenerationPattern class.
		 */
		public YearlyRegenerationPattern() {
			super();

		}

		/**
		 * Initializes a new instance of the YearlyRegenerationPattern class.
		 * 
		 * @param startDate
		 *            the start date
		 * @param interval
		 *            the interval
		 * @throws ArgumentOutOfRangeException
		 *             the argument out of range exception
		 */
		public YearlyRegenerationPattern(Date startDate, int interval)
				throws ArgumentOutOfRangeException {
			super(startDate, interval);

		}
	}
}

/*
 * Core API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.joda.time.DateTime;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * TradesFilter
 */

public class TradesFilter
{
	@SerializedName("investmentProgramId")
	private UUID investmentProgramId = null;

	@SerializedName("dateFrom")
	private DateTime dateFrom = null;

	@SerializedName("dateTo")
	private DateTime dateTo = null;

	@SerializedName("symbol")
	private String symbol = null;

	@SerializedName("sorting")
	private SortingEnum sorting = null;

	@SerializedName("skip")
	private Integer skip = null;

	@SerializedName("take")
	private Integer take = null;

	public TradesFilter investmentProgramId(UUID investmentProgramId) {
		this.investmentProgramId = investmentProgramId;
		return this;
	}

	/**
	 * Get investmentProgramId
	 *
	 * @return investmentProgramId
	 **/
	@ApiModelProperty(value = "")
	public UUID getInvestmentProgramId() {
		return investmentProgramId;
	}

	public void setInvestmentProgramId(UUID investmentProgramId) {
		this.investmentProgramId = investmentProgramId;
	}

	public TradesFilter dateFrom(DateTime dateFrom) {
		this.dateFrom = dateFrom;
		return this;
	}

	/**
	 * Get dateFrom
	 *
	 * @return dateFrom
	 **/
	@ApiModelProperty(value = "")
	public DateTime getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(DateTime dateFrom) {
		this.dateFrom = dateFrom;
	}

	public TradesFilter dateTo(DateTime dateTo) {
		this.dateTo = dateTo;
		return this;
	}

	/**
	 * Get dateTo
	 *
	 * @return dateTo
	 **/
	@ApiModelProperty(value = "")
	public DateTime getDateTo() {
		return dateTo;
	}

	public void setDateTo(DateTime dateTo) {
		this.dateTo = dateTo;
	}

	public TradesFilter symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	/**
	 * Get symbol
	 *
	 * @return symbol
	 **/
	@ApiModelProperty(value = "")
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public TradesFilter sorting(SortingEnum sorting) {
		this.sorting = sorting;
		return this;
	}

	/**
	 * Get sorting
	 *
	 * @return sorting
	 **/
	@ApiModelProperty(value = "")
	public SortingEnum getSorting() {
		return sorting;
	}

	public void setSorting(SortingEnum sorting) {
		this.sorting = sorting;
	}

	public TradesFilter skip(Integer skip) {
		this.skip = skip;
		return this;
	}

	/**
	 * Get skip
	 *
	 * @return skip
	 **/
	@ApiModelProperty(value = "")
	public Integer getSkip() {
		return skip;
	}

	public void setSkip(Integer skip) {
		this.skip = skip;
	}

	public TradesFilter take(Integer take) {
		this.take = take;
		return this;
	}

	/**
	 * Get take
	 *
	 * @return take
	 **/
	@ApiModelProperty(value = "")
	public Integer getTake() {
		return take;
	}

	public void setTake(Integer take) {
		this.take = take;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TradesFilter tradesFilter = (TradesFilter) o;
		return Objects.equals(this.investmentProgramId, tradesFilter.investmentProgramId) &&
				Objects.equals(this.dateFrom, tradesFilter.dateFrom) &&
				Objects.equals(this.dateTo, tradesFilter.dateTo) &&
				Objects.equals(this.symbol, tradesFilter.symbol) &&
				Objects.equals(this.sorting, tradesFilter.sorting) &&
				Objects.equals(this.skip, tradesFilter.skip) &&
				Objects.equals(this.take, tradesFilter.take);
	}

	@Override
	public int hashCode() {
		return Objects.hash(investmentProgramId, dateFrom, dateTo, symbol, sorting, skip, take);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TradesFilter {\n");

		sb.append("    investmentProgramId: ").append(toIndentedString(investmentProgramId)).append("\n");
		sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
		sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
		sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
		sb.append("    take: ").append(toIndentedString(take)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	/**
	 * Gets or Sets sorting
	 */
	@JsonAdapter(SortingEnum.Adapter.class)
	public enum SortingEnum
	{
		BYDATEASK("ByDateAsk"),

		BYDATEDESC("ByDateDesc"),

		BYTICKETASK("ByTicketAsk"),

		BYTICKETDESC("ByTicketDesc"),

		BYSYMBOLASK("BySymbolAsk"),

		BYSYMBOLDESC("BySymbolDesc"),

		BYDIRECTIONASK("ByDirectionAsk"),

		BYDIRECTIONDESC("ByDirectionDesc");

		public static SortingEnum fromValue(String text) {
			for (SortingEnum b : SortingEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		SortingEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<SortingEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final SortingEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public SortingEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return SortingEnum.fromValue(String.valueOf(value));
			}
		}
	}

}


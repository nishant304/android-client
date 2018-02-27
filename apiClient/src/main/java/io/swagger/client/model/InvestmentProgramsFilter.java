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

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvestmentProgramsFilter
 */

public class InvestmentProgramsFilter
{
	@SerializedName("managerId")
	private UUID managerId = null;

	@SerializedName("brokerId")
	private UUID brokerId = null;

	@SerializedName("brokerTradeServerId")
	private UUID brokerTradeServerId = null;

	@SerializedName("investMaxAmountFrom")
	private Double investMaxAmountFrom = null;

	@SerializedName("investMaxAmountTo")
	private Double investMaxAmountTo = null;

	@SerializedName("sorting")
	private SortingEnum sorting = null;

	@SerializedName("skip")
	private Integer skip = null;

	@SerializedName("take")
	private Integer take = null;

	public InvestmentProgramsFilter managerId(UUID managerId) {
		this.managerId = managerId;
		return this;
	}

	/**
	 * Get managerId
	 *
	 * @return managerId
	 **/
	@ApiModelProperty(value = "")
	public UUID getManagerId() {
		return managerId;
	}

	public void setManagerId(UUID managerId) {
		this.managerId = managerId;
	}

	public InvestmentProgramsFilter brokerId(UUID brokerId) {
		this.brokerId = brokerId;
		return this;
	}

	/**
	 * Get brokerId
	 *
	 * @return brokerId
	 **/
	@ApiModelProperty(value = "")
	public UUID getBrokerId() {
		return brokerId;
	}

	public void setBrokerId(UUID brokerId) {
		this.brokerId = brokerId;
	}

	public InvestmentProgramsFilter brokerTradeServerId(UUID brokerTradeServerId) {
		this.brokerTradeServerId = brokerTradeServerId;
		return this;
	}

	/**
	 * Get brokerTradeServerId
	 *
	 * @return brokerTradeServerId
	 **/
	@ApiModelProperty(value = "")
	public UUID getBrokerTradeServerId() {
		return brokerTradeServerId;
	}

	public void setBrokerTradeServerId(UUID brokerTradeServerId) {
		this.brokerTradeServerId = brokerTradeServerId;
	}

	public InvestmentProgramsFilter investMaxAmountFrom(Double investMaxAmountFrom) {
		this.investMaxAmountFrom = investMaxAmountFrom;
		return this;
	}

	/**
	 * Get investMaxAmountFrom
	 *
	 * @return investMaxAmountFrom
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestMaxAmountFrom() {
		return investMaxAmountFrom;
	}

	public void setInvestMaxAmountFrom(Double investMaxAmountFrom) {
		this.investMaxAmountFrom = investMaxAmountFrom;
	}

	public InvestmentProgramsFilter investMaxAmountTo(Double investMaxAmountTo) {
		this.investMaxAmountTo = investMaxAmountTo;
		return this;
	}

	/**
	 * Get investMaxAmountTo
	 *
	 * @return investMaxAmountTo
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestMaxAmountTo() {
		return investMaxAmountTo;
	}

	public void setInvestMaxAmountTo(Double investMaxAmountTo) {
		this.investMaxAmountTo = investMaxAmountTo;
	}

	public InvestmentProgramsFilter sorting(SortingEnum sorting) {
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

	public InvestmentProgramsFilter skip(Integer skip) {
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

	public InvestmentProgramsFilter take(Integer take) {
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
		InvestmentProgramsFilter investmentProgramsFilter = (InvestmentProgramsFilter) o;
		return Objects.equals(this.managerId, investmentProgramsFilter.managerId) &&
				Objects.equals(this.brokerId, investmentProgramsFilter.brokerId) &&
				Objects.equals(this.brokerTradeServerId, investmentProgramsFilter.brokerTradeServerId) &&
				Objects.equals(this.investMaxAmountFrom, investmentProgramsFilter.investMaxAmountFrom) &&
				Objects.equals(this.investMaxAmountTo, investmentProgramsFilter.investMaxAmountTo) &&
				Objects.equals(this.sorting, investmentProgramsFilter.sorting) &&
				Objects.equals(this.skip, investmentProgramsFilter.skip) &&
				Objects.equals(this.take, investmentProgramsFilter.take);
	}

	@Override
	public int hashCode() {
		return Objects.hash(managerId, brokerId, brokerTradeServerId, investMaxAmountFrom, investMaxAmountTo, sorting, skip, take);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentProgramsFilter {\n");

		sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
		sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
		sb.append("    brokerTradeServerId: ").append(toIndentedString(brokerTradeServerId)).append("\n");
		sb.append("    investMaxAmountFrom: ").append(toIndentedString(investMaxAmountFrom)).append("\n");
		sb.append("    investMaxAmountTo: ").append(toIndentedString(investMaxAmountTo)).append("\n");
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
		BYRATINGASC("ByRatingAsc"),

		BYRATINGDESC("ByRatingDesc"),

		BYPROFITASC("ByProfitAsc"),

		BYPROFITDESC("ByProfitDesc"),

		BYORDERSASC("ByOrdersAsc"),

		BYORDERSDESC("ByOrdersDesc");

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

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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * Period
 */

public class Period
{
	@SerializedName("id")
	private UUID id = null;

	@SerializedName("number")
	private Integer number = null;

	@SerializedName("dateFrom")
	private DateTime dateFrom = null;

	@SerializedName("dateTo")
	private DateTime dateTo = null;

	@SerializedName("status")
	private StatusEnum status = null;

	@SerializedName("startBalance")
	private Double startBalance = null;

	@SerializedName("managerStartBalance")
	private Double managerStartBalance = null;

	@SerializedName("managerStartShare")
	private Double managerStartShare = null;

	@SerializedName("processStatus")
	private ProcessStatusEnum processStatus = null;

	@SerializedName("investmentRequest")
	private List<InvestmentProgramRequest> investmentRequest = null;

	public Period id(UUID id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Period number(Integer number) {
		this.number = number;
		return this;
	}

	/**
	 * Get number
	 *
	 * @return number
	 **/
	@ApiModelProperty(value = "")
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Period dateFrom(DateTime dateFrom) {
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

	public Period dateTo(DateTime dateTo) {
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

	public Period status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Period startBalance(Double startBalance) {
		this.startBalance = startBalance;
		return this;
	}

	/**
	 * Get startBalance
	 *
	 * @return startBalance
	 **/
	@ApiModelProperty(value = "")
	public Double getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(Double startBalance) {
		this.startBalance = startBalance;
	}

	public Period managerStartBalance(Double managerStartBalance) {
		this.managerStartBalance = managerStartBalance;
		return this;
	}

	/**
	 * Get managerStartBalance
	 *
	 * @return managerStartBalance
	 **/
	@ApiModelProperty(value = "")
	public Double getManagerStartBalance() {
		return managerStartBalance;
	}

	public void setManagerStartBalance(Double managerStartBalance) {
		this.managerStartBalance = managerStartBalance;
	}

	public Period managerStartShare(Double managerStartShare) {
		this.managerStartShare = managerStartShare;
		return this;
	}

	/**
	 * Get managerStartShare
	 *
	 * @return managerStartShare
	 **/
	@ApiModelProperty(value = "")
	public Double getManagerStartShare() {
		return managerStartShare;
	}

	public void setManagerStartShare(Double managerStartShare) {
		this.managerStartShare = managerStartShare;
	}

	public Period processStatus(ProcessStatusEnum processStatus) {
		this.processStatus = processStatus;
		return this;
	}

	/**
	 * Get processStatus
	 *
	 * @return processStatus
	 **/
	@ApiModelProperty(value = "")
	public ProcessStatusEnum getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(ProcessStatusEnum processStatus) {
		this.processStatus = processStatus;
	}

	public Period investmentRequest(List<InvestmentProgramRequest> investmentRequest) {
		this.investmentRequest = investmentRequest;
		return this;
	}

	public Period addInvestmentRequestItem(InvestmentProgramRequest investmentRequestItem) {
		if (this.investmentRequest == null) {
			this.investmentRequest = new ArrayList<InvestmentProgramRequest>();
		}
		this.investmentRequest.add(investmentRequestItem);
		return this;
	}

	/**
	 * Get investmentRequest
	 *
	 * @return investmentRequest
	 **/
	@ApiModelProperty(value = "")
	public List<InvestmentProgramRequest> getInvestmentRequest() {
		return investmentRequest;
	}

	public void setInvestmentRequest(List<InvestmentProgramRequest> investmentRequest) {
		this.investmentRequest = investmentRequest;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Period period = (Period) o;
		return Objects.equals(this.id, period.id) &&
				Objects.equals(this.number, period.number) &&
				Objects.equals(this.dateFrom, period.dateFrom) &&
				Objects.equals(this.dateTo, period.dateTo) &&
				Objects.equals(this.status, period.status) &&
				Objects.equals(this.startBalance, period.startBalance) &&
				Objects.equals(this.managerStartBalance, period.managerStartBalance) &&
				Objects.equals(this.managerStartShare, period.managerStartShare) &&
				Objects.equals(this.processStatus, period.processStatus) &&
				Objects.equals(this.investmentRequest, period.investmentRequest);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, number, dateFrom, dateTo, status, startBalance, managerStartBalance, managerStartShare, processStatus, investmentRequest);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Period {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    number: ").append(toIndentedString(number)).append("\n");
		sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
		sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    startBalance: ").append(toIndentedString(startBalance)).append("\n");
		sb.append("    managerStartBalance: ").append(toIndentedString(managerStartBalance)).append("\n");
		sb.append("    managerStartShare: ").append(toIndentedString(managerStartShare)).append("\n");
		sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
		sb.append("    investmentRequest: ").append(toIndentedString(investmentRequest)).append("\n");
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
	 * Gets or Sets status
	 */
	@JsonAdapter(StatusEnum.Adapter.class)
	public enum StatusEnum
	{
		PLANNED("Planned"),

		INPROCCESS("InProccess"),

		CLOSED("Closed");

		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<StatusEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public StatusEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return StatusEnum.fromValue(String.valueOf(value));
			}
		}
	}

	/**
	 * Gets or Sets processStatus
	 */
	@JsonAdapter(ProcessStatusEnum.Adapter.class)
	public enum ProcessStatusEnum
	{
		NONE("None"),

		ACCRUEPROFITSDONE("AccrueProfitsDone"),

		REEVALUATEMANAGERTOKENDONE("ReevaluateManagerTokenDone"),

		PROCESSINVESTMENTREQUESTSDONE("ProcessInvestmentRequestsDone"),

		CLOSEPERIODDONE("ClosePeriodDone");

		public static ProcessStatusEnum fromValue(String text) {
			for (ProcessStatusEnum b : ProcessStatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		ProcessStatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<ProcessStatusEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final ProcessStatusEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ProcessStatusEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ProcessStatusEnum.fromValue(String.valueOf(value));
			}
		}
	}

}


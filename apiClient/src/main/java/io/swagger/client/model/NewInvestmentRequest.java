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

import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * NewInvestmentRequest
 */

public class NewInvestmentRequest
{
	@SerializedName("brokerTradeServerId")
	private UUID brokerTradeServerId = null;

	@SerializedName("tradePlatformPassword")
	private String tradePlatformPassword = null;

	@SerializedName("depositAmount")
	private Double depositAmount = null;

	@SerializedName("tokenName")
	private String tokenName = null;

	@SerializedName("tokenSymbol")
	private String tokenSymbol = null;

	@SerializedName("dateFrom")
	private DateTime dateFrom = null;

	@SerializedName("dateTo")
	private DateTime dateTo = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("feeManagement")
	private Double feeManagement = null;

	@SerializedName("feeSuccess")
	private Double feeSuccess = null;

	@SerializedName("investMinAmount")
	private Double investMinAmount = null;

	@SerializedName("investMaxAmount")
	private Double investMaxAmount = null;

	@SerializedName("period")
	private Integer period = null;

	public NewInvestmentRequest brokerTradeServerId(UUID brokerTradeServerId) {
		this.brokerTradeServerId = brokerTradeServerId;
		return this;
	}

	/**
	 * Get brokerTradeServerId
	 *
	 * @return brokerTradeServerId
	 **/
	@ApiModelProperty(required = true, value = "")
	public UUID getBrokerTradeServerId() {
		return brokerTradeServerId;
	}

	public void setBrokerTradeServerId(UUID brokerTradeServerId) {
		this.brokerTradeServerId = brokerTradeServerId;
	}

	public NewInvestmentRequest tradePlatformPassword(String tradePlatformPassword) {
		this.tradePlatformPassword = tradePlatformPassword;
		return this;
	}

	/**
	 * Get tradePlatformPassword
	 *
	 * @return tradePlatformPassword
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getTradePlatformPassword() {
		return tradePlatformPassword;
	}

	public void setTradePlatformPassword(String tradePlatformPassword) {
		this.tradePlatformPassword = tradePlatformPassword;
	}

	public NewInvestmentRequest depositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
		return this;
	}

	/**
	 * Get depositAmount
	 *
	 * @return depositAmount
	 **/
	@ApiModelProperty(required = true, value = "")
	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public NewInvestmentRequest tokenName(String tokenName) {
		this.tokenName = tokenName;
		return this;
	}

	/**
	 * Get tokenName
	 *
	 * @return tokenName
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getTokenName() {
		return tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	public NewInvestmentRequest tokenSymbol(String tokenSymbol) {
		this.tokenSymbol = tokenSymbol;
		return this;
	}

	/**
	 * Get tokenSymbol
	 *
	 * @return tokenSymbol
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getTokenSymbol() {
		return tokenSymbol;
	}

	public void setTokenSymbol(String tokenSymbol) {
		this.tokenSymbol = tokenSymbol;
	}

	public NewInvestmentRequest dateFrom(DateTime dateFrom) {
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

	public NewInvestmentRequest dateTo(DateTime dateTo) {
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

	public NewInvestmentRequest logo(String logo) {
		this.logo = logo;
		return this;
	}

	/**
	 * Get logo
	 *
	 * @return logo
	 **/
	@ApiModelProperty(value = "")
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public NewInvestmentRequest title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public NewInvestmentRequest description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@ApiModelProperty(value = "")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public NewInvestmentRequest feeManagement(Double feeManagement) {
		this.feeManagement = feeManagement;
		return this;
	}

	/**
	 * Get feeManagement
	 *
	 * @return feeManagement
	 **/
	@ApiModelProperty(value = "")
	public Double getFeeManagement() {
		return feeManagement;
	}

	public void setFeeManagement(Double feeManagement) {
		this.feeManagement = feeManagement;
	}

	public NewInvestmentRequest feeSuccess(Double feeSuccess) {
		this.feeSuccess = feeSuccess;
		return this;
	}

	/**
	 * Get feeSuccess
	 *
	 * @return feeSuccess
	 **/
	@ApiModelProperty(value = "")
	public Double getFeeSuccess() {
		return feeSuccess;
	}

	public void setFeeSuccess(Double feeSuccess) {
		this.feeSuccess = feeSuccess;
	}

	public NewInvestmentRequest investMinAmount(Double investMinAmount) {
		this.investMinAmount = investMinAmount;
		return this;
	}

	/**
	 * Get investMinAmount
	 *
	 * @return investMinAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestMinAmount() {
		return investMinAmount;
	}

	public void setInvestMinAmount(Double investMinAmount) {
		this.investMinAmount = investMinAmount;
	}

	public NewInvestmentRequest investMaxAmount(Double investMaxAmount) {
		this.investMaxAmount = investMaxAmount;
		return this;
	}

	/**
	 * Get investMaxAmount
	 *
	 * @return investMaxAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestMaxAmount() {
		return investMaxAmount;
	}

	public void setInvestMaxAmount(Double investMaxAmount) {
		this.investMaxAmount = investMaxAmount;
	}

	public NewInvestmentRequest period(Integer period) {
		this.period = period;
		return this;
	}

	/**
	 * Get period
	 *
	 * @return period
	 **/
	@ApiModelProperty(required = true, value = "")
	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NewInvestmentRequest newInvestmentRequest = (NewInvestmentRequest) o;
		return Objects.equals(this.brokerTradeServerId, newInvestmentRequest.brokerTradeServerId) &&
				Objects.equals(this.tradePlatformPassword, newInvestmentRequest.tradePlatformPassword) &&
				Objects.equals(this.depositAmount, newInvestmentRequest.depositAmount) &&
				Objects.equals(this.tokenName, newInvestmentRequest.tokenName) &&
				Objects.equals(this.tokenSymbol, newInvestmentRequest.tokenSymbol) &&
				Objects.equals(this.dateFrom, newInvestmentRequest.dateFrom) &&
				Objects.equals(this.dateTo, newInvestmentRequest.dateTo) &&
				Objects.equals(this.logo, newInvestmentRequest.logo) &&
				Objects.equals(this.title, newInvestmentRequest.title) &&
				Objects.equals(this.description, newInvestmentRequest.description) &&
				Objects.equals(this.feeManagement, newInvestmentRequest.feeManagement) &&
				Objects.equals(this.feeSuccess, newInvestmentRequest.feeSuccess) &&
				Objects.equals(this.investMinAmount, newInvestmentRequest.investMinAmount) &&
				Objects.equals(this.investMaxAmount, newInvestmentRequest.investMaxAmount) &&
				Objects.equals(this.period, newInvestmentRequest.period);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brokerTradeServerId, tradePlatformPassword, depositAmount, tokenName, tokenSymbol, dateFrom, dateTo, logo, title, description, feeManagement, feeSuccess, investMinAmount, investMaxAmount, period);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NewInvestmentRequest {\n");

		sb.append("    brokerTradeServerId: ").append(toIndentedString(brokerTradeServerId)).append("\n");
		sb.append("    tradePlatformPassword: ").append(toIndentedString(tradePlatformPassword)).append("\n");
		sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
		sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
		sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
		sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
		sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    feeManagement: ").append(toIndentedString(feeManagement)).append("\n");
		sb.append("    feeSuccess: ").append(toIndentedString(feeSuccess)).append("\n");
		sb.append("    investMinAmount: ").append(toIndentedString(investMinAmount)).append("\n");
		sb.append("    investMaxAmount: ").append(toIndentedString(investMaxAmount)).append("\n");
		sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

}


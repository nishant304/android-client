package io.swagger.client.api;

import java.util.UUID;

import io.swagger.client.model.BrokersFilter;
import io.swagger.client.model.BrokersViewModel;
import io.swagger.client.model.ChangePasswordViewModel;
import io.swagger.client.model.ForgotPasswordViewModel;
import io.swagger.client.model.Invest;
import io.swagger.client.model.InvestmentProgramBuyToken;
import io.swagger.client.model.InvestmentProgramRequests;
import io.swagger.client.model.InvestmentProgramRequestsFilter;
import io.swagger.client.model.InvestmentProgramViewModel;
import io.swagger.client.model.InvestmentProgramsFilter;
import io.swagger.client.model.InvestmentProgramsViewModel;
import io.swagger.client.model.LoginViewModel;
import io.swagger.client.model.ManagerDashboardProgramsFilter;
import io.swagger.client.model.ManagerDashboardStatistic;
import io.swagger.client.model.ManagerInvestmentPrograms;
import io.swagger.client.model.NewInvestmentRequest;
import io.swagger.client.model.ProfileFullViewModel;
import io.swagger.client.model.ProfilePublicViewModel;
import io.swagger.client.model.RegisterManagerViewModel;
import io.swagger.client.model.ResetPasswordViewModel;
import io.swagger.client.model.TradesChartViewModel;
import io.swagger.client.model.TradesFilter;
import io.swagger.client.model.TradesViewModel;
import io.swagger.client.model.TransactionsFilter;
import io.swagger.client.model.UpdateProfileViewModel;
import io.swagger.client.model.WalletAddressViewModel;
import io.swagger.client.model.WalletInvestmentPrograms;
import io.swagger.client.model.WalletStatistic;
import io.swagger.client.model.WalletStatisticFilter;
import io.swagger.client.model.WalletTransactionsViewModel;
import io.swagger.client.model.WalletWithdrawRequestModel;
import io.swagger.client.model.WalletsViewModel;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface ManagerApi
{
	/**
	 * Create new investment request
	 *
	 * @param authorization JWT access token (required)
	 * @param request       (optional)
	 * @return Call&lt;UUID&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/account/newInvestmentRequest")
	Observable<UUID> apiManagerAccountNewInvestmentRequestPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body NewInvestmentRequest request
	);

	/**
	 * Confirm email after registration
	 *
	 * @param userId (optional)
	 * @param code   (optional)
	 * @return Call&lt;String&gt;
	 */
	@POST("api/manager/auth/confirmEmail")
	Observable<String> apiManagerAuthConfirmEmailPost(
			@retrofit2.http.Query("userId") String userId, @retrofit2.http.Query("code") String code
	);

	/**
	 * Forgot password
	 *
	 * @param model (optional)
	 * @return Call&lt;Void&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/auth/forgotPassword")
	Observable<Void> apiManagerAuthForgotPasswordPost(
			@retrofit2.http.Body ForgotPasswordViewModel model
	);

	/**
	 * Reset password
	 *
	 * @param model (optional)
	 * @return Call&lt;String&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/auth/resetPassword")
	Observable<String> apiManagerAuthResetPasswordPost(
			@retrofit2.http.Body ResetPasswordViewModel model
	);

	/**
	 * Authorize
	 *
	 * @param model (optional)
	 * @return Call&lt;String&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/auth/signIn")
	Observable<String> apiManagerAuthSignInPost(
			@retrofit2.http.Body LoginViewModel model
	);

	/**
	 * Register new manager
	 *
	 * @param model (optional)
	 * @return Call&lt;Void&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/auth/signUp")
	Observable<Void> apiManagerAuthSignUpPost(
			@retrofit2.http.Body RegisterManagerViewModel model
	);

	/**
	 * Update auth token
	 *
	 * @param authorization JWT access token (required)
	 * @return Call&lt;String&gt;
	 */
	@GET("api/manager/auth/updateToken")
	Observable<String> apiManagerAuthUpdateTokenGet(
			@retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Change password
	 *
	 * @param authorization JWT access token (required)
	 * @param model         (optional)
	 * @return Call&lt;Void&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/auth/сhangePassword")
	Observable<Void> apiManagerAuthhangePasswordPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body ChangePasswordViewModel model
	);

	/**
	 * Get all enabled trade servers
	 *
	 * @param filter (optional)
	 * @return Call&lt;BrokersViewModel&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/brokers")
	Observable<BrokersViewModel> apiManagerBrokersPost(
			@retrofit2.http.Body BrokersFilter filter
	);

	/**
	 * Dashboard programs
	 *
	 * @param authorization JWT access token (required)
	 * @param filter        (optional)
	 * @return Call&lt;ManagerInvestmentPrograms&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@GET("api/manager/dashboard/programs")
	Observable<ManagerInvestmentPrograms> apiManagerDashboardProgramsGet(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body ManagerDashboardProgramsFilter filter
	);

	/**
	 * Dashboard statistic
	 *
	 * @param authorization JWT access token (required)
	 * @return Call&lt;ManagerDashboardStatistic&gt;
	 */
	@GET("api/manager/dashboard/statistic")
	Observable<ManagerDashboardStatistic> apiManagerDashboardStatisticGet(
			@retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Cancel investment request
	 *
	 * @param requestId     (required)
	 * @param authorization JWT access token (required)
	 * @return Call&lt;Void&gt;
	 */
	@POST("api/manager/investment/cancelInvestmentRequest")
	Observable<Void> apiManagerInvestmentCancelInvestmentRequestPost(
			@retrofit2.http.Query("requestId") UUID requestId, @retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Close existing investment program
	 *
	 * @param investmentProgramId (required)
	 * @param authorization       JWT access token (required)
	 * @return Call&lt;Void&gt;
	 */
	@POST("api/manager/investment/close")
	Observable<Void> apiManagerInvestmentClosePost(
			@retrofit2.http.Query("investmentProgramId") UUID investmentProgramId, @retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Manager deposit in his own investment program
	 *
	 * @param authorization JWT access token (required)
	 * @param model         (optional)
	 * @return Call&lt;Void&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/investment/invest")
	Observable<Void> apiManagerInvestmentInvestPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body Invest model
	);

	/**
	 * Get investment program buy token model
	 *
	 * @param investmentProgramId (required)
	 * @param authorization       JWT access token (required)
	 * @return Call&lt;InvestmentProgramBuyToken&gt;
	 */
	@GET("api/manager/investmentProgram/buyTokens")
	Observable<InvestmentProgramBuyToken> apiManagerInvestmentProgramBuyTokensGet(
			@retrofit2.http.Query("investmentProgramId") UUID investmentProgramId, @retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Get investment program details by id
	 *
	 * @param investmentProgramId (required)
	 * @param authorization       (optional)
	 * @return Call&lt;InvestmentProgramViewModel&gt;
	 */
	@GET("api/manager/investmentProgram")
	Observable<InvestmentProgramViewModel> apiManagerInvestmentProgramGet(
			@retrofit2.http.Query("investmentProgramId") UUID investmentProgramId, @retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Get investment program&#39;s requests
	 *
	 * @param authorization JWT access token (required)
	 * @param filter        (optional)
	 * @return Call&lt;InvestmentProgramRequests&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/investmentProgram/requests")
	Observable<InvestmentProgramRequests> apiManagerInvestmentProgramRequestsPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body InvestmentProgramRequestsFilter filter
	);

	/**
	 * Get manager trades chart
	 *
	 * @param investmentProgramId (required)
	 * @return Call&lt;TradesChartViewModel&gt;
	 */
	@GET("api/manager/investmentProgram/trades/chart")
	Observable<TradesChartViewModel> apiManagerInvestmentProgramTradesChartGet(
			@retrofit2.http.Query("InvestmentProgramId") UUID investmentProgramId
	);

	/**
	 * Get manager trade history
	 *
	 * @param filter (optional)
	 * @return Call&lt;TradesViewModel&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/investmentProgram/trades")
	Observable<TradesViewModel> apiManagerInvestmentProgramTradesPost(
			@retrofit2.http.Body TradesFilter filter
	);

	/**
	 * Cancel investment request
	 *
	 * @param requestId     (required)
	 * @param authorization JWT access token (required)
	 * @return Call&lt;Void&gt;
	 */
	@POST("api/manager/investmentPrograms/cancelInvestmentRequest")
	Observable<Void> apiManagerInvestmentProgramsCancelInvestmentRequestPost(
			@retrofit2.http.Query("requestId") UUID requestId, @retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Invest in manager
	 *
	 * @param authorization JWT access token (required)
	 * @param model         (optional)
	 * @return Call&lt;WalletsViewModel&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/investmentPrograms/invest")
	Observable<WalletsViewModel> apiManagerInvestmentProgramsInvestPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body Invest model
	);

	/**
	 * Get public investment program&#39;s list
	 *
	 * @param authorization (optional)
	 * @param filter        (optional)
	 * @return Call&lt;InvestmentProgramsViewModel&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/investmentPrograms")
	Observable<InvestmentProgramsViewModel> apiManagerInvestmentProgramsPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body InvestmentProgramsFilter filter
	);

	/**
	 * Withdraw from investment program
	 *
	 * @param authorization JWT access token (required)
	 * @param model         (optional)
	 * @return Call&lt;Void&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/investmentPrograms/withdraw")
	Observable<Void> apiManagerInvestmentProgramsWithdrawPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body Invest model
	);

	/**
	 * Manager withdrawal from his own investment program
	 *
	 * @param authorization JWT access token (required)
	 * @param model         (optional)
	 * @return Call&lt;Void&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/investment/withdraw")
	Observable<Void> apiManagerInvestmentWithdrawPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body Invest model
	);

	/**
	 * Get full profile
	 *
	 * @param authorization JWT access token (required)
	 * @return Call&lt;ProfileFullViewModel&gt;
	 */
	@GET("api/manager/profile/full")
	Observable<ProfileFullViewModel> apiManagerProfileFullGet(
			@retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Get public profile
	 *
	 * @param userId (required)
	 * @return Call&lt;ProfilePublicViewModel&gt;
	 */
	@GET("api/manager/profile/public")
	Observable<ProfilePublicViewModel> apiManagerProfilePublicGet(
			@retrofit2.http.Query("userId") UUID userId
	);

	/**
	 * Update profile
	 *
	 * @param authorization JWT access token (required)
	 * @param model         (optional)
	 * @return Call&lt;Void&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/profile/update")
	Observable<Void> apiManagerProfileUpdatePost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body UpdateProfileViewModel model
	);

	/**
	 * Get eth address for GVT depositing
	 *
	 * @param authorization JWT access token (required)
	 * @return Call&lt;WalletAddressViewModel&gt;
	 */
	@GET("api/manager/wallet/address")
	Observable<WalletAddressViewModel> apiManagerWalletAddressGet(
			@retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Get user wallets
	 *
	 * @param authorization JWT access token (required)
	 * @return Call&lt;WalletsViewModel&gt;
	 */
	@GET("api/manager/wallet")
	Observable<WalletsViewModel> apiManagerWalletGet(
			@retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Get user wallet statistic
	 *
	 * @param authorization JWT access token (required)
	 * @param filter        (optional)
	 * @return Call&lt;WalletStatistic&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/wallet/statistic")
	Observable<WalletStatistic> apiManagerWalletStatisticPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body WalletStatisticFilter filter
	);

	/**
	 * Get user investment programs with tx
	 *
	 * @param authorization JWT access token (required)
	 * @param mask          (optional)
	 * @return Call&lt;WalletInvestmentPrograms&gt;
	 */
	@GET("api/manager/wallet/transactions/investmentProgramsList")
	Observable<WalletInvestmentPrograms> apiManagerWalletTransactionsInvestmentProgramsListGet(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Query("mask") String mask
	);

	/**
	 * Get user wallet transactions
	 *
	 * @param authorization JWT access token (required)
	 * @param filter        (optional)
	 * @return Call&lt;WalletTransactionsViewModel&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/wallet/transactions")
	Observable<WalletTransactionsViewModel> apiManagerWalletTransactionsPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body TransactionsFilter filter
	);

	/**
	 * Withdraw request
	 *
	 * @param authorization JWT access token (required)
	 * @param request       (optional)
	 * @return Call&lt;Void&gt;
	 */
	@Headers({
			"Content-Type:application/json"
	})
	@POST("api/manager/wallet/withdrawRequest")
	Observable<Void> apiManagerWalletWithdrawRequestPost(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body WalletWithdrawRequestModel request
	);

}

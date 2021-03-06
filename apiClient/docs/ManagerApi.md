# ManagerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiManagerAccountNewInvestmentRequestPost**](ManagerApi.md#apiManagerAccountNewInvestmentRequestPost) | **POST** api/manager/account/newInvestmentRequest | Create new investment request
[**apiManagerAuthConfirmEmailPost**](ManagerApi.md#apiManagerAuthConfirmEmailPost) | **POST** api/manager/auth/confirmEmail | Confirm email after registration
[**apiManagerAuthForgotPasswordPost**](ManagerApi.md#apiManagerAuthForgotPasswordPost) | **POST** api/manager/auth/forgotPassword | Forgot password
[**apiManagerAuthResetPasswordPost**](ManagerApi.md#apiManagerAuthResetPasswordPost) | **POST** api/manager/auth/resetPassword | Reset password
[**apiManagerAuthSignInPost**](ManagerApi.md#apiManagerAuthSignInPost) | **POST** api/manager/auth/signIn | Authorize
[**apiManagerAuthSignUpPost**](ManagerApi.md#apiManagerAuthSignUpPost) | **POST** api/manager/auth/signUp | Register new manager
[**apiManagerAuthUpdateTokenGet**](ManagerApi.md#apiManagerAuthUpdateTokenGet) | **GET** api/manager/auth/updateToken | Update auth token
[**apiManagerAuthhangePasswordPost**](ManagerApi.md#apiManagerAuthhangePasswordPost) | **POST** api/manager/auth/сhangePassword | Change password
[**apiManagerBrokersPost**](ManagerApi.md#apiManagerBrokersPost) | **POST** api/manager/brokers | Get all enabled trade servers
[**apiManagerDashboardProgramsGet**](ManagerApi.md#apiManagerDashboardProgramsGet) | **GET** api/manager/dashboard/programs | Dashboard programs
[**apiManagerDashboardStatisticGet**](ManagerApi.md#apiManagerDashboardStatisticGet) | **GET** api/manager/dashboard/statistic | Dashboard statistic
[**apiManagerInvestmentCancelInvestmentRequestPost**](ManagerApi.md#apiManagerInvestmentCancelInvestmentRequestPost) | **POST** api/manager/investment/cancelInvestmentRequest | Cancel investment request
[**apiManagerInvestmentClosePost**](ManagerApi.md#apiManagerInvestmentClosePost) | **POST** api/manager/investment/close | Close existing investment program
[**apiManagerInvestmentInvestPost**](ManagerApi.md#apiManagerInvestmentInvestPost) | **POST** api/manager/investment/invest | Manager deposit in his own investment program
[**apiManagerInvestmentProgramBuyTokensGet**](ManagerApi.md#apiManagerInvestmentProgramBuyTokensGet) | **GET** api/manager/investmentProgram/buyTokens | Get investment program buy token model
[**apiManagerInvestmentProgramGet**](ManagerApi.md#apiManagerInvestmentProgramGet) | **GET** api/manager/investmentProgram | Get investment program details by id
[**apiManagerInvestmentProgramRequestsPost**](ManagerApi.md#apiManagerInvestmentProgramRequestsPost) | **POST** api/manager/investmentProgram/requests | Get investment program&#39;s requests
[**apiManagerInvestmentProgramTradesChartGet**](ManagerApi.md#apiManagerInvestmentProgramTradesChartGet) | **GET** api/manager/investmentProgram/trades/chart | Get manager trades chart
[**apiManagerInvestmentProgramTradesPost**](ManagerApi.md#apiManagerInvestmentProgramTradesPost) | **POST** api/manager/investmentProgram/trades | Get manager trade history
[**apiManagerInvestmentProgramsCancelInvestmentRequestPost**](ManagerApi.md#apiManagerInvestmentProgramsCancelInvestmentRequestPost) | **POST** api/manager/investmentPrograms/cancelInvestmentRequest | Cancel investment request
[**apiManagerInvestmentProgramsInvestPost**](ManagerApi.md#apiManagerInvestmentProgramsInvestPost) | **POST** api/manager/investmentPrograms/invest | Invest in manager
[**apiManagerInvestmentProgramsPost**](ManagerApi.md#apiManagerInvestmentProgramsPost) | **POST** api/manager/investmentPrograms | Get public investment program&#39;s list
[**apiManagerInvestmentProgramsWithdrawPost**](ManagerApi.md#apiManagerInvestmentProgramsWithdrawPost) | **POST** api/manager/investmentPrograms/withdraw | Withdraw from investment program
[**apiManagerInvestmentWithdrawPost**](ManagerApi.md#apiManagerInvestmentWithdrawPost) | **POST** api/manager/investment/withdraw | Manager withdrawal from his own investment program
[**apiManagerProfileFullGet**](ManagerApi.md#apiManagerProfileFullGet) | **GET** api/manager/profile/full | Get full profile
[**apiManagerProfilePublicGet**](ManagerApi.md#apiManagerProfilePublicGet) | **GET** api/manager/profile/public | Get public profile
[**apiManagerProfileUpdatePost**](ManagerApi.md#apiManagerProfileUpdatePost) | **POST** api/manager/profile/update | Update profile
[**apiManagerWalletAddressGet**](ManagerApi.md#apiManagerWalletAddressGet) | **GET** api/manager/wallet/address | Get eth address for GVT depositing
[**apiManagerWalletGet**](ManagerApi.md#apiManagerWalletGet) | **GET** api/manager/wallet | Get user wallets
[**apiManagerWalletStatisticPost**](ManagerApi.md#apiManagerWalletStatisticPost) | **POST** api/manager/wallet/statistic | Get user wallet statistic
[**apiManagerWalletTransactionsInvestmentProgramsListGet**](ManagerApi.md#apiManagerWalletTransactionsInvestmentProgramsListGet) | **GET** api/manager/wallet/transactions/investmentProgramsList | Get user investment programs with tx
[**apiManagerWalletTransactionsPost**](ManagerApi.md#apiManagerWalletTransactionsPost) | **POST** api/manager/wallet/transactions | Get user wallet transactions
[**apiManagerWalletWithdrawRequestPost**](ManagerApi.md#apiManagerWalletWithdrawRequestPost) | **POST** api/manager/wallet/withdrawRequest | Withdraw request


<a name="apiManagerAccountNewInvestmentRequestPost"></a>
# **apiManagerAccountNewInvestmentRequestPost**
> UUID apiManagerAccountNewInvestmentRequestPost(authorization, request)

Create new investment request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
NewInvestmentRequest request = new NewInvestmentRequest(); // NewInvestmentRequest | 
try {
    UUID result = apiInstance.apiManagerAccountNewInvestmentRequestPost(authorization, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerAccountNewInvestmentRequestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **request** | [**NewInvestmentRequest**](NewInvestmentRequest.md)|  | [optional]

### Return type

[**UUID**](UUID.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerAuthConfirmEmailPost"></a>
# **apiManagerAuthConfirmEmailPost**
> String apiManagerAuthConfirmEmailPost(userId, code)

Confirm email after registration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String userId = "userId_example"; // String | 
String code = "code_example"; // String | 
try {
    String result = apiInstance.apiManagerAuthConfirmEmailPost(userId, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerAuthConfirmEmailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **code** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerAuthForgotPasswordPost"></a>
# **apiManagerAuthForgotPasswordPost**
> Void apiManagerAuthForgotPasswordPost(model)

Forgot password

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
ForgotPasswordViewModel model = new ForgotPasswordViewModel(); // ForgotPasswordViewModel | 
try {
    Void result = apiInstance.apiManagerAuthForgotPasswordPost(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerAuthForgotPasswordPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**ForgotPasswordViewModel**](ForgotPasswordViewModel.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerAuthResetPasswordPost"></a>
# **apiManagerAuthResetPasswordPost**
> String apiManagerAuthResetPasswordPost(model)

Reset password

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
ResetPasswordViewModel model = new ResetPasswordViewModel(); // ResetPasswordViewModel | 
try {
    String result = apiInstance.apiManagerAuthResetPasswordPost(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerAuthResetPasswordPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**ResetPasswordViewModel**](ResetPasswordViewModel.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerAuthSignInPost"></a>
# **apiManagerAuthSignInPost**
> String apiManagerAuthSignInPost(model)

Authorize

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
LoginViewModel model = new LoginViewModel(); // LoginViewModel | 
try {
    String result = apiInstance.apiManagerAuthSignInPost(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerAuthSignInPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**LoginViewModel**](LoginViewModel.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerAuthSignUpPost"></a>
# **apiManagerAuthSignUpPost**
> Void apiManagerAuthSignUpPost(model)

Register new manager

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
RegisterManagerViewModel model = new RegisterManagerViewModel(); // RegisterManagerViewModel | 
try {
    Void result = apiInstance.apiManagerAuthSignUpPost(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerAuthSignUpPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**RegisterManagerViewModel**](RegisterManagerViewModel.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerAuthUpdateTokenGet"></a>
# **apiManagerAuthUpdateTokenGet**
> String apiManagerAuthUpdateTokenGet(authorization)

Update auth token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
try {
    String result = apiInstance.apiManagerAuthUpdateTokenGet(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerAuthUpdateTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerAuthhangePasswordPost"></a>
# **apiManagerAuthhangePasswordPost**
> Void apiManagerAuthhangePasswordPost(authorization, model)

Change password

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
ChangePasswordViewModel model = new ChangePasswordViewModel(); // ChangePasswordViewModel | 
try {
    Void result = apiInstance.apiManagerAuthhangePasswordPost(authorization, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerAuthhangePasswordPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **model** | [**ChangePasswordViewModel**](ChangePasswordViewModel.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerBrokersPost"></a>
# **apiManagerBrokersPost**
> BrokersViewModel apiManagerBrokersPost(filter)

Get all enabled trade servers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
BrokersFilter filter = new BrokersFilter(); // BrokersFilter | 
try {
    BrokersViewModel result = apiInstance.apiManagerBrokersPost(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerBrokersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**BrokersFilter**](BrokersFilter.md)|  | [optional]

### Return type

[**BrokersViewModel**](BrokersViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerDashboardProgramsGet"></a>
# **apiManagerDashboardProgramsGet**
> ManagerInvestmentPrograms apiManagerDashboardProgramsGet(authorization, filter)

Dashboard programs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
ManagerDashboardProgramsFilter filter = new ManagerDashboardProgramsFilter(); // ManagerDashboardProgramsFilter | 
try {
    ManagerInvestmentPrograms result = apiInstance.apiManagerDashboardProgramsGet(authorization, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerDashboardProgramsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **filter** | [**ManagerDashboardProgramsFilter**](ManagerDashboardProgramsFilter.md)|  | [optional]

### Return type

[**ManagerInvestmentPrograms**](ManagerInvestmentPrograms.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerDashboardStatisticGet"></a>
# **apiManagerDashboardStatisticGet**
> ManagerDashboardStatistic apiManagerDashboardStatisticGet(authorization)

Dashboard statistic

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
try {
    ManagerDashboardStatistic result = apiInstance.apiManagerDashboardStatisticGet(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerDashboardStatisticGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |

### Return type

[**ManagerDashboardStatistic**](ManagerDashboardStatistic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentCancelInvestmentRequestPost"></a>
# **apiManagerInvestmentCancelInvestmentRequestPost**
> Void apiManagerInvestmentCancelInvestmentRequestPost(requestId, authorization)

Cancel investment request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
UUID requestId = new UUID(); // UUID | 
String authorization = "authorization_example"; // String | JWT access token
try {
    Void result = apiInstance.apiManagerInvestmentCancelInvestmentRequestPost(requestId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentCancelInvestmentRequestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | [**UUID**](.md)|  |
 **authorization** | **String**| JWT access token |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentClosePost"></a>
# **apiManagerInvestmentClosePost**
> Void apiManagerInvestmentClosePost(investmentProgramId, authorization)

Close existing investment program

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
UUID investmentProgramId = new UUID(); // UUID | 
String authorization = "authorization_example"; // String | JWT access token
try {
    Void result = apiInstance.apiManagerInvestmentClosePost(investmentProgramId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentClosePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **investmentProgramId** | [**UUID**](.md)|  |
 **authorization** | **String**| JWT access token |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentInvestPost"></a>
# **apiManagerInvestmentInvestPost**
> Void apiManagerInvestmentInvestPost(authorization, model)

Manager deposit in his own investment program

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
Invest model = new Invest(); // Invest | 
try {
    Void result = apiInstance.apiManagerInvestmentInvestPost(authorization, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentInvestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **model** | [**Invest**](Invest.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramBuyTokensGet"></a>
# **apiManagerInvestmentProgramBuyTokensGet**
> InvestmentProgramBuyToken apiManagerInvestmentProgramBuyTokensGet(investmentProgramId, authorization)

Get investment program buy token model

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
UUID investmentProgramId = new UUID(); // UUID | 
String authorization = "authorization_example"; // String | JWT access token
try {
    InvestmentProgramBuyToken result = apiInstance.apiManagerInvestmentProgramBuyTokensGet(investmentProgramId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramBuyTokensGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **investmentProgramId** | [**UUID**](.md)|  |
 **authorization** | **String**| JWT access token |

### Return type

[**InvestmentProgramBuyToken**](InvestmentProgramBuyToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramGet"></a>
# **apiManagerInvestmentProgramGet**
> InvestmentProgramViewModel apiManagerInvestmentProgramGet(investmentProgramId, authorization)

Get investment program details by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
UUID investmentProgramId = new UUID(); // UUID | 
String authorization = "authorization_example"; // String | 
try {
    InvestmentProgramViewModel result = apiInstance.apiManagerInvestmentProgramGet(investmentProgramId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **investmentProgramId** | [**UUID**](.md)|  |
 **authorization** | **String**|  | [optional]

### Return type

[**InvestmentProgramViewModel**](InvestmentProgramViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramRequestsPost"></a>
# **apiManagerInvestmentProgramRequestsPost**
> InvestmentProgramRequests apiManagerInvestmentProgramRequestsPost(authorization, filter)

Get investment program&#39;s requests

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
InvestmentProgramRequestsFilter filter = new InvestmentProgramRequestsFilter(); // InvestmentProgramRequestsFilter | 
try {
    InvestmentProgramRequests result = apiInstance.apiManagerInvestmentProgramRequestsPost(authorization, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramRequestsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **filter** | [**InvestmentProgramRequestsFilter**](InvestmentProgramRequestsFilter.md)|  | [optional]

### Return type

[**InvestmentProgramRequests**](InvestmentProgramRequests.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramTradesChartGet"></a>
# **apiManagerInvestmentProgramTradesChartGet**
> TradesChartViewModel apiManagerInvestmentProgramTradesChartGet(investmentProgramId)

Get manager trades chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
UUID investmentProgramId = new UUID(); // UUID | 
try {
    TradesChartViewModel result = apiInstance.apiManagerInvestmentProgramTradesChartGet(investmentProgramId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramTradesChartGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **investmentProgramId** | [**UUID**](.md)|  |

### Return type

[**TradesChartViewModel**](TradesChartViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramTradesPost"></a>
# **apiManagerInvestmentProgramTradesPost**
> TradesViewModel apiManagerInvestmentProgramTradesPost(filter)

Get manager trade history

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
TradesFilter filter = new TradesFilter(); // TradesFilter | 
try {
    TradesViewModel result = apiInstance.apiManagerInvestmentProgramTradesPost(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramTradesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**TradesFilter**](TradesFilter.md)|  | [optional]

### Return type

[**TradesViewModel**](TradesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramsCancelInvestmentRequestPost"></a>
# **apiManagerInvestmentProgramsCancelInvestmentRequestPost**
> Void apiManagerInvestmentProgramsCancelInvestmentRequestPost(requestId, authorization)

Cancel investment request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
UUID requestId = new UUID(); // UUID | 
String authorization = "authorization_example"; // String | JWT access token
try {
    Void result = apiInstance.apiManagerInvestmentProgramsCancelInvestmentRequestPost(requestId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramsCancelInvestmentRequestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | [**UUID**](.md)|  |
 **authorization** | **String**| JWT access token |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramsInvestPost"></a>
# **apiManagerInvestmentProgramsInvestPost**
> WalletsViewModel apiManagerInvestmentProgramsInvestPost(authorization, model)

Invest in manager

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
Invest model = new Invest(); // Invest | 
try {
    WalletsViewModel result = apiInstance.apiManagerInvestmentProgramsInvestPost(authorization, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramsInvestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **model** | [**Invest**](Invest.md)|  | [optional]

### Return type

[**WalletsViewModel**](WalletsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramsPost"></a>
# **apiManagerInvestmentProgramsPost**
> InvestmentProgramsViewModel apiManagerInvestmentProgramsPost(authorization, filter)

Get public investment program&#39;s list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | 
InvestmentProgramsFilter filter = new InvestmentProgramsFilter(); // InvestmentProgramsFilter | 
try {
    InvestmentProgramsViewModel result = apiInstance.apiManagerInvestmentProgramsPost(authorization, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional]
 **filter** | [**InvestmentProgramsFilter**](InvestmentProgramsFilter.md)|  | [optional]

### Return type

[**InvestmentProgramsViewModel**](InvestmentProgramsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentProgramsWithdrawPost"></a>
# **apiManagerInvestmentProgramsWithdrawPost**
> Void apiManagerInvestmentProgramsWithdrawPost(authorization, model)

Withdraw from investment program

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
Invest model = new Invest(); // Invest | 
try {
    Void result = apiInstance.apiManagerInvestmentProgramsWithdrawPost(authorization, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentProgramsWithdrawPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **model** | [**Invest**](Invest.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerInvestmentWithdrawPost"></a>
# **apiManagerInvestmentWithdrawPost**
> Void apiManagerInvestmentWithdrawPost(authorization, model)

Manager withdrawal from his own investment program

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
Invest model = new Invest(); // Invest | 
try {
    Void result = apiInstance.apiManagerInvestmentWithdrawPost(authorization, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerInvestmentWithdrawPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **model** | [**Invest**](Invest.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerProfileFullGet"></a>
# **apiManagerProfileFullGet**
> ProfileFullViewModel apiManagerProfileFullGet(authorization)

Get full profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
try {
    ProfileFullViewModel result = apiInstance.apiManagerProfileFullGet(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerProfileFullGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |

### Return type

[**ProfileFullViewModel**](ProfileFullViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerProfilePublicGet"></a>
# **apiManagerProfilePublicGet**
> ProfilePublicViewModel apiManagerProfilePublicGet(userId)

Get public profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
UUID userId = new UUID(); // UUID | 
try {
    ProfilePublicViewModel result = apiInstance.apiManagerProfilePublicGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerProfilePublicGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)|  |

### Return type

[**ProfilePublicViewModel**](ProfilePublicViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerProfileUpdatePost"></a>
# **apiManagerProfileUpdatePost**
> Void apiManagerProfileUpdatePost(authorization, model)

Update profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
UpdateProfileViewModel model = new UpdateProfileViewModel(); // UpdateProfileViewModel | 
try {
    Void result = apiInstance.apiManagerProfileUpdatePost(authorization, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerProfileUpdatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **model** | [**UpdateProfileViewModel**](UpdateProfileViewModel.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerWalletAddressGet"></a>
# **apiManagerWalletAddressGet**
> WalletAddressViewModel apiManagerWalletAddressGet(authorization)

Get eth address for GVT depositing

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
try {
    WalletAddressViewModel result = apiInstance.apiManagerWalletAddressGet(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerWalletAddressGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |

### Return type

[**WalletAddressViewModel**](WalletAddressViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerWalletGet"></a>
# **apiManagerWalletGet**
> WalletsViewModel apiManagerWalletGet(authorization)

Get user wallets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
try {
    WalletsViewModel result = apiInstance.apiManagerWalletGet(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerWalletGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |

### Return type

[**WalletsViewModel**](WalletsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerWalletStatisticPost"></a>
# **apiManagerWalletStatisticPost**
> WalletStatistic apiManagerWalletStatisticPost(authorization, filter)

Get user wallet statistic

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
WalletStatisticFilter filter = new WalletStatisticFilter(); // WalletStatisticFilter | 
try {
    WalletStatistic result = apiInstance.apiManagerWalletStatisticPost(authorization, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerWalletStatisticPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **filter** | [**WalletStatisticFilter**](WalletStatisticFilter.md)|  | [optional]

### Return type

[**WalletStatistic**](WalletStatistic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerWalletTransactionsInvestmentProgramsListGet"></a>
# **apiManagerWalletTransactionsInvestmentProgramsListGet**
> WalletInvestmentPrograms apiManagerWalletTransactionsInvestmentProgramsListGet(authorization, mask)

Get user investment programs with tx

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
String mask = "mask_example"; // String | 
try {
    WalletInvestmentPrograms result = apiInstance.apiManagerWalletTransactionsInvestmentProgramsListGet(authorization, mask);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerWalletTransactionsInvestmentProgramsListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **mask** | **String**|  | [optional]

### Return type

[**WalletInvestmentPrograms**](WalletInvestmentPrograms.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerWalletTransactionsPost"></a>
# **apiManagerWalletTransactionsPost**
> WalletTransactionsViewModel apiManagerWalletTransactionsPost(authorization, filter)

Get user wallet transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
TransactionsFilter filter = new TransactionsFilter(); // TransactionsFilter | 
try {
    WalletTransactionsViewModel result = apiInstance.apiManagerWalletTransactionsPost(authorization, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerWalletTransactionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **filter** | [**TransactionsFilter**](TransactionsFilter.md)|  | [optional]

### Return type

[**WalletTransactionsViewModel**](WalletTransactionsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiManagerWalletWithdrawRequestPost"></a>
# **apiManagerWalletWithdrawRequestPost**
> Void apiManagerWalletWithdrawRequestPost(authorization, request)

Withdraw request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManagerApi;


ManagerApi apiInstance = new ManagerApi();
String authorization = "authorization_example"; // String | JWT access token
WalletWithdrawRequestModel request = new WalletWithdrawRequestModel(); // WalletWithdrawRequestModel | 
try {
    Void result = apiInstance.apiManagerWalletWithdrawRequestPost(authorization, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagerApi#apiManagerWalletWithdrawRequestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT access token |
 **request** | [**WalletWithdrawRequestModel**](WalletWithdrawRequestModel.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


package vision.genesis.clientapp.feature.main.program.requests;

import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import io.swagger.client.model.InvestmentProgramRequest;
import io.swagger.client.model.InvestmentProgramRequests;
import io.swagger.client.model.InvestmentProgramRequestsFilter;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.managers.InvestManager;
import vision.genesis.clientapp.model.events.OnCancelRequestClickedEvent;

/**
 * GenesisVision
 * Created by Vitaly on 3/1/18.
 */

@InjectViewState
public class RequestsPresenter extends MvpPresenter<RequestsView>
{
	@Inject
	public Context context;

	@Inject
	public InvestManager investManager;

	private Subscription getRequestsSubscription;

	private Subscription cancelRequestSubscription;

	private List<InvestmentProgramRequest> requests = new ArrayList<>();

	private UUID programId;

	@Override
	protected void onFirstViewAttach() {
		super.onFirstViewAttach();

		GenesisVisionApplication.getComponent().inject(this);

		EventBus.getDefault().register(this);
	}

	@Override
	public void attachView(RequestsView view) {
		super.attachView(view);

		if (programId != null)
			getRequests();
	}

	@Override
	public void onDestroy() {
		if (getRequestsSubscription != null)
			getRequestsSubscription.unsubscribe();
		if (cancelRequestSubscription != null)
			cancelRequestSubscription.unsubscribe();

		EventBus.getDefault().unregister(this);

		super.onDestroy();
	}

	void setProgramId(UUID programId) {
		this.programId = programId;
	}

	void onSwipeRefresh() {
		getRequests();
	}

	private void getRequests() {
		getViewState().setRefreshing(true);
		InvestmentProgramRequestsFilter filter = new InvestmentProgramRequestsFilter();
		filter.setInvestmentProgramId(programId);
		getRequestsSubscription = investManager.getInvestmentProgramRequests(filter)
				.observeOn(AndroidSchedulers.mainThread())
				.subscribeOn(Schedulers.io())
				.subscribe(this::handleGetRequestsSuccess,
						this::handleGetRequestsError);
	}

	private void handleGetRequestsSuccess(InvestmentProgramRequests response) {
		getRequestsSubscription.unsubscribe();

		getViewState().setRefreshing(false);

		List<InvestmentProgramRequest> requests = response.getRequests();

		this.requests = new ArrayList<>();
		for (InvestmentProgramRequest request : requests) {
			if (request.getStatus().equals(InvestmentProgramRequest.StatusEnum.NEW))
				this.requests.add(request);
		}

		if (this.requests.size() == 0) {
			getViewState().finishActivity();
		}
		else {
			getViewState().setRequests(this.requests);
		}
	}

	private void handleGetRequestsError(Throwable throwable) {
		getRequestsSubscription.unsubscribe();

		getViewState().setRefreshing(false);
		getViewState().finishActivity();
//		if (ApiErrorResolver.isNetworkError(throwable)) {
//			if (requests.size() == 0)
//				getViewState().showNoInternet(true);
//			getViewState().showSnackbarMessage(context.getResources().getString(R.string.network_error));
//		}
	}

	private void cancelRequest(UUID requestId) {
		cancelRequestSubscription = investManager.cancelRequest(requestId)
				.observeOn(AndroidSchedulers.mainThread())
				.subscribeOn(Schedulers.io())
				.subscribe(this::handleCancelRequestSuccess,
						this::handleCancelRequestError);
	}

	private void handleCancelRequestSuccess(Void response) {
		getRequestsSubscription.unsubscribe();

		getViewState().setRefreshing(false);

		getRequests();
	}

	private void handleCancelRequestError(Throwable throwable) {
		getRequestsSubscription.unsubscribe();

		getViewState().setRefreshing(false);
		getViewState().finishActivity();
//		if (ApiErrorResolver.isNetworkError(throwable)) {
//			if (requests.size() == 0)
//				getViewState().showNoInternet(true);
//			getViewState().showSnackbarMessage(context.getResources().getString(R.string.network_error));
//		}
	}

	@Subscribe
	public void onEventMainThread(OnCancelRequestClickedEvent event) {
		cancelRequest(event.requestId);
	}
}

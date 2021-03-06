package vision.genesis.clientapp.feature.main.program.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.swagger.client.model.InvestmentProgram;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.model.events.ShowInvestmentProgramDetailsEvent;
import vision.genesis.clientapp.ui.AvatarView;
import vision.genesis.clientapp.ui.ProfitChartView;
import vision.genesis.clientapp.ui.ProgramDataView;
import vision.genesis.clientapp.utils.TypefaceUtil;

/**
 * GenesisVision
 * Created by Vitaly on 1/25/18.
 */

public class InvestmentProgramsListAdapter extends RecyclerView.Adapter<InvestmentProgramsListAdapter.InvestmentProgramViewHolder>
{
	public List<InvestmentProgram> investmentPrograms = new ArrayList<>();

	@Override
	public InvestmentProgramViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_investment_program, parent, false);
		return new InvestmentProgramViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(InvestmentProgramViewHolder holder, int position) {
		holder.setInvestmentProgram(investmentPrograms.get(position));
	}

	@Override
	public int getItemCount() {
		return investmentPrograms.size();
	}

	void setInvestmentPrograms(List<InvestmentProgram> investmentPrograms) {
		this.investmentPrograms.clear();
		this.investmentPrograms.addAll(investmentPrograms);
		notifyDataSetChanged();
	}

	void addInvestmentPrograms(List<InvestmentProgram> investmentPrograms) {
		this.investmentPrograms.addAll(investmentPrograms);
		notifyDataSetChanged();
	}

	static class InvestmentProgramViewHolder extends RecyclerView.ViewHolder
	{
		@BindView(R.id.avatar)
		public AvatarView avatar;

		@BindView(R.id.title)
		public TextView title;

		@BindView(R.id.manager_name)
		public TextView managerName;

		@BindView(R.id.view_program_data)
		public ProgramDataView programDataView;

		@BindView(R.id.chart)
		public ProfitChartView chart;

		private InvestmentProgram investmentProgram;

		private Context context;

		InvestmentProgramViewHolder(View itemView) {
			super(itemView);

			context = itemView.getContext();

			ButterKnife.bind(this, itemView);

			setFonts();

			itemView.setOnClickListener(v -> EventBus.getDefault().post(new ShowInvestmentProgramDetailsEvent(investmentProgram.getId())));
		}

		private void setFonts() {
			title.setTypeface(TypefaceUtil.bold(itemView.getContext()));
		}

		void setInvestmentProgram(InvestmentProgram investmentProgram) {
			this.investmentProgram = investmentProgram;
			updateData();
		}

		private void updateData() {
			avatar.setImage(investmentProgram.getLogo());
			avatar.setLevel(investmentProgram.getLevel());
			title.setText(investmentProgram.getTitle());
			managerName.setText(String.format(Locale.getDefault(), "%s %s",
					context.getResources().getString(R.string.by),
					investmentProgram.getManager().getUsername()));

			programDataView.setData(investmentProgram.getProfitTotal(),
					investmentProgram.getProfitAvg(),
					investmentProgram.getBalance(),
					investmentProgram.getInvestorsCount(),
					investmentProgram.getCurrency().toString());

			chart.setChart(investmentProgram.getChart());
		}
	}
}

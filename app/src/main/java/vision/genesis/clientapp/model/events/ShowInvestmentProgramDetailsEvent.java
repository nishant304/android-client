package vision.genesis.clientapp.model.events;


import vision.genesis.clientapp.model.InvestmentProgram;

/**
 * GenesisVision
 * Created by Vitaly on 1/26/18.
 */

public class ShowInvestmentProgramDetailsEvent
{
	public InvestmentProgram investmentProgram;

	public ShowInvestmentProgramDetailsEvent(InvestmentProgram investmentProgram) {
		this.investmentProgram = investmentProgram;
	}
}
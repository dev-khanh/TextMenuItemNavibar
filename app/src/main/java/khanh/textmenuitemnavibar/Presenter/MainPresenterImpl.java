package khanh.textmenuitemnavibar.Presenter;

import khanh.textmenuitemnavibar.InterFace.GetQuoteInteractor;
import khanh.textmenuitemnavibar.InterFace.MainPresenter;
import khanh.textmenuitemnavibar.InterFace.MainView;

public class MainPresenterImpl implements MainPresenter, GetQuoteInteractor.OnFinishedListtener {

    private MainView mainView;
    private GetQuoteInteractor getQuoteInteractor;

    public MainPresenterImpl(MainView mainView, GetQuoteInteractor getQuoteInteractor) {
        this.mainView = mainView;
        this.getQuoteInteractor = getQuoteInteractor;
    }

    @Override
    public void onFinished(String string) {
        if (mainView != null){
            mainView.setQuote(string);
            mainView.hideProgress();
        }
    }

    @Override
    public void onButtonClick() {
        if (mainView != null)
            mainView.showProgress();
        getQuoteInteractor.getNextQuote(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }
}

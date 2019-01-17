package khanh.textmenuitemnavibar.InterFace;

public interface GetQuoteInteractor {
    interface OnFinishedListtener{
        void onFinished(String string);
    }
    void getNextQuote(OnFinishedListtener listtener);
}

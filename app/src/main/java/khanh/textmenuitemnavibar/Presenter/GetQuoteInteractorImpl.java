package khanh.textmenuitemnavibar.Presenter;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import khanh.textmenuitemnavibar.InterFace.GetQuoteInteractor;

public class GetQuoteInteractorImpl implements GetQuoteInteractor {
    private List<String> arrayList = Arrays.asList(
            "Be yourself. everyone else is already taken.",
            "A room without books is like a body without a soul.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world.",
            "If you tell the truth, you don't have to remember anything."
    );
    @Override
    public void getNextQuote(final OnFinishedListtener listtener) {
      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              listtener.onFinished(getRamdomString());
          }
      }, 1200);
    }

    private String getRamdomString() {
        Random rd = new Random();
        int index = rd.nextInt(arrayList.size());
        return arrayList.get(index);
    }

}

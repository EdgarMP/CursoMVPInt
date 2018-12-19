package com.edgarmarcopolo.cursomvpint.interactors;

import com.edgarmarcopolo.cursomvpint.interfaces.MainActivityInteractor;
import com.edgarmarcopolo.cursomvpint.interfaces.MainActivityPresenter;
import com.edgarmarcopolo.cursomvpint.presenters.MainActivityPresenterImpl;

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;
    private String data;

    public MainActivityInteractorImpl(MainActivityPresenterImpl presenter){
        this.presenter = presenter;
    }

    @Override
    public void addName(String s) {
        data = s + " texto extra";
        presenter.showResult(data);
    }
}

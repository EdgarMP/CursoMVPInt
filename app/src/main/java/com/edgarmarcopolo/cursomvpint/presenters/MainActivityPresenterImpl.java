package com.edgarmarcopolo.cursomvpint.presenters;

import com.edgarmarcopolo.cursomvpint.interactors.MainActivityInteractorImpl;
import com.edgarmarcopolo.cursomvpint.interfaces.MainActivityInteractor;
import com.edgarmarcopolo.cursomvpint.interfaces.MainActivityPresenter;
import com.edgarmarcopolo.cursomvpint.interfaces.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView view;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(MainActivityView view){
        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void showResult(String s) {
        if(view !=null){
            view.showResult(s);
        }
    }

    @Override
    public void addName(String s) {
        if(view!=null){
            interactor.addName(s);
        }
    }
}

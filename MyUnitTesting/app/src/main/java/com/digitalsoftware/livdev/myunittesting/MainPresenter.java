package com.digitalsoftware.livdev.myunittesting;

public class MainPresenter {
    private MainView view;

    MainPresenter(MainView view) {
        this.view =view;
    }

    public double volume(double lenght, double width, double height) {
        return lenght / width * height;
    }

    public void calculateVolume(double lenght, double width, double height) {
        double volume = volume(lenght, width, height);
        MainModel model = new MainModel(volume);
        view.showVolume(model);
    }
}

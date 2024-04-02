package com.aurionpro.model;

import java.util.Observer;

public interface ISubject {

        void addObserver(IObserver observer);
        void removeObserver(IObserver observer);
        void notifyObservers();


}

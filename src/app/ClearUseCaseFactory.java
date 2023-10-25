package app;

import entity.UserFactory;
import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearPresenter;
import interface_adapter.clear_users.ClearViewModel;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInteractor;
import use_case.clear_users.ClearUserDataAccessInterface;
import use_case.clear_users.ClearOutputBoundary;

public class ClearUseCaseFactory {

    static ClearController createClearUseCase(ClearViewModel clearViewModel,
                                              ClearUserDataAccessInterface clearUserDataAccessObject) {
        ClearOutputBoundary clearOutputBoundary = new ClearPresenter(clearViewModel);

        ClearInputBoundary clearInteractor = new ClearInteractor( clearUserDataAccessObject, clearOutputBoundary);

        return new ClearController(clearInteractor);

    }

}

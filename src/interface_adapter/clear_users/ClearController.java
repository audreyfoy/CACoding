package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

import java.io.IOException;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearUseCaseInteractor;

    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute() {

    }
}

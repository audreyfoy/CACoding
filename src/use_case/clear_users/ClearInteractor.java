package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessInterface;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearPresenter) {
        this.userDataAccessInterface = clearUserDataAccessInterface;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {
        String userNames = userDataAccessInterface.clear();
        ClearOutputData clearOutputData = new ClearOutputData(userNames);
        clearPresenter.prepareSuccessView(clearOutputData);

    }
}

package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    public void prepareSuccessView(ClearOutputData response) {
        ClearState clearState = clearViewModel.getState();
        String usernames = clearState.getClearedUsernames();
        clearState.setClearedUsernames(usernames);
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();

    }
}

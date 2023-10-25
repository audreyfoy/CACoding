package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    private ClearState state = new ClearState();

    public ClearViewModel(String viewName) {
        super("clear");
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public ClearState getState() {
        return state;
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}

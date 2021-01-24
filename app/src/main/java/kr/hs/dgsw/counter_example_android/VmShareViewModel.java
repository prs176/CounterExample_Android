package kr.hs.dgsw.counter_example_android;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VmShareViewModel extends ViewModel {
    public MutableLiveData<Integer> progress = new MutableLiveData<>();

    public VmShareViewModel() {
        progress.setValue(50);
    }
}

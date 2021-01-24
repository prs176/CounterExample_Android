package kr.hs.dgsw.counter_example_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import kr.hs.dgsw.counter_example_android.databinding.ActivityCounterBinding;

public class CounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        ActivityCounterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_counter);
        binding.setLifecycleOwner(this);

        CounterViewModel viewModel = new ViewModelProvider(this).get(CounterViewModel.class);
        binding.setViewModel(viewModel);

    }
}
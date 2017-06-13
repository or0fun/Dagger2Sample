package com.baiwanlu.dagger2sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.baiwanlu.librarysample.SampleModel;
import com.baiwanlu.librarysample.SampleModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Inject
    SampleModel sampleModel;
    @BindView(R.id.sample)
    TextView sample;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DaggerSampleComponent.builder().sampleModule(new SampleModule()).build().inject(this);

        sample.setText(sampleModel.getName());
    }

}

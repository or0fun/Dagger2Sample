package com.baiwanlu.librarysample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lufei on 6/13/17.
 */

@Module
public class SampleModule {

    public SampleModule() {}

    @Provides
    SampleModel provideSample() {
        SampleModel sampleModel = new SampleModel();
        sampleModel.setName("test");
        sampleModel.setAge(18);
        return sampleModel;
    }
}

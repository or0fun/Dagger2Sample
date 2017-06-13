package com.baiwanlu.dagger2sample;

import com.baiwanlu.librarysample.SampleModule;

import dagger.Component;

/**
 * Created by lufei on 6/13/17.
 */

@Component(modules = {SampleModule.class})
public interface SampleComponent {
    void inject(MainActivity mainActivity);
}

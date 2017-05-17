package com.devliu.learning;

import dagger.Component;

/**
 * Created by liuhao
 * on 2017/5/17
 * use to :
 */

@Component
public interface MainComponent {

    void inject(MainActivity mainActivity);

}

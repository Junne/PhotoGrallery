package com.github.junne.photograllery;

import android.support.v4.app.Fragment;

public class PhotoGralleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment creatFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}

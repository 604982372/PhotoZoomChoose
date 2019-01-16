package cn.xiwu.photozoomchoose;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import cn.xiwu.photozoomchoose.R;
import cn.xiwu.photozoomchoose.myview.PhotoViewAttacherZoom;
import cn.xiwu.photozoomchoose.myview.PhotoViewZoom;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        PhotoViewZoom img = findViewById(R.id.elect_body_im);
        img.setOnPhotoTapListener(new PhotoViewAttacherZoom.OnPhotoTapListener(){
            @Override
            public void onPhotoTap(View view, float x, float y) {
                Log.v("3699ooo",x+"***********"+y);

            }
        });
    }
}

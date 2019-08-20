package com.fig.jrttadapter;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;

/**
 * density = dpi / 160
 * px = dp * (dpi / 160)
 * px = dp * density
 * <p>
 * 今日头条适配方案原理：
 * xml文件中用dp为单位进行开发，在不同机型动态修改density保证dp显示效果一致，
 * 不过需要选择的是以宽为适配基准还是以高为适配基准
 * <p>
 * 参考：https://mp.weixin.qq.com/s/d9QCoBP6kV9VSWvVldVVwA
 */
public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        DisplayMetrics displayMetrics1 = getResources().getDisplayMetrics();
        Log.i(TAG, "density: " + displayMetrics1.density +
                "  densityDpi: " + displayMetrics1.densityDpi +
                "  heightPixels: " + displayMetrics1.heightPixels +
                "  widthPixels: " + displayMetrics1.widthPixels +
                "  scaledDensity(字体缩放因子): " + displayMetrics1.scaledDensity +
                "  xdpi: " + displayMetrics1.xdpi +
                "  ydpi: " + displayMetrics1.ydpi);

        //修改density需要在setContentView之前
        AdaptUtil.setDefault(this);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Log.i(TAG, "density: " + displayMetrics.density +
                "  densityDpi: " + displayMetrics.densityDpi +
                "  heightPixels: " + displayMetrics.heightPixels +
                "  widthPixels: " + displayMetrics.widthPixels +
                "  scaledDensity: " + displayMetrics.scaledDensity +
                "  xdpi: " + displayMetrics.xdpi +
                "  ydpi: " + displayMetrics.ydpi
        );
    }
}

# FigJRTTScreenAdapter
> 今日头条适配方案：https://mp.weixin.qq.com/s/d9QCoBP6kV9VSWvVldVVwA

### 原理：
- 动态修改application和activity的density值
- xml文件中开发仍使用dp单位开发
- 需要指定是以宽或高为基准适配，并设定相应的默认宽高值

### 效果如下(以宽为基准，默认宽600px)：
机型一（s700）：
- 分辨率：800 * 480
- density：1
- dpi：160
- scaledDensity：1

![s700](https://github.com/fengfeilong0529/FigJRTTScreenAdapter/blob/master/s700.png "s700")


机型二（rx3288）：
- 分辨率：1024 * 600
- density：1
- dpi：160
- scaledDensity：1

![rk3288](https://github.com/fengfeilong0529/FigJRTTScreenAdapter/blob/master/rk3288.png "rk3288")

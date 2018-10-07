# JAnimation  Android 5.0高级动画开发
   
    学习安排
        VertorDrawable 矢量图VertorDrawable + Android中的属性动画 -----> 实现其他动画技术难以实现的酷炫动画
        Bezier曲线  使用Bezier曲线实现轨迹动画
        PathMeasure 使用PatHMeasure实现各种酷炫动画
        
    VertorDrawable基础知识
        SVG和Vector差异
            SVG --- 前段中使用，是一套语法规范
            Vector --- 在Android中使用
            Vector只是先了SVG语法的Path标签
            
        Vector的常用语法
            M = moveTO(M x,y) ：将画笔移动到指定的坐标位置
            L = lineTo(L x,y) ：画直线到指定的坐标位置
            Z = closePah() ：关闭路径
            
            H = horizontal lineTo(H x) ：画水平线到指定的X坐标位置
            V = vertical lineTo(V y) ：画垂直线到指定的Y坐标位置
            
        SVG特点：
            不会失真
            比png小很多
            
        简单案例：
        
        <vector
            xmlns:android="http://schemas.android.com/apk/res/android"
            android:width="200dp"  //矢量图宽
            android:height="200dp" //矢量图高
            android:viewportHeight="500"  //代表固定大小的矢量图等分量
            android:viewportWidth="500">
        
            <path
                android:name="square"
                android:fillColor="#000000"
                android:pathData="M100,100,L400,100,L400,400,L100,400z"/>
        
        </vector>
        
        VectorDrawable兼容性
            Android L 
            只兼容minSDK>=21的版本
            >几乎没有兼容性
            
            Gradle Plugin 1.5
                设备版本>=21 ---使用Vector
                设备版本< 21 ---将Vector转换为PNG（编译时完成）
                >增加了兼容的成本，效果也有限
                
            AppCompat 23.2
                静态Vector支持Android 2.1+
                动态Vector支持Android 3.0+
                >几乎可以兼容大部分使用场景
                
            注意：在项目中使用vectorDrawable需要在app Module的build.gradle里面android标签下的defaultConfig里面添加vectorDrawables.useSupportLibrary = true//使用vectorDrawables.useSupportLibrary = true
                  并且appcompat-v7的库依赖版本需要大于等于23.2
                
        使用静态的VectorDrawable
        
            Vector图像标签：
                android:width\android:height --- 定义图片的宽高
                android:viewportHeight\android:viewportWidth --- 定义图像被划分的比例大小
            在控件中使用：
                ImageView\ImageButton --- app:srcCompat="@drawable/vector_image"
                
                Button不可以直接使用srcCompat来作为button的背景，但是可以使用selector来使用vectorDrawable
                Button --- 通过Selector来进行设置，并开启下面的设置
                static{
                    AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
                }
                
                注意：经测试，Button里面可以直接使用vectorDrawable,不需要按照上述方式使用，案例如下，
                
                <Button
                        android:layout_width="50dp"
                        android:layout_height="50dp"
                        android:background="@drawable/ic_voice_light"/>
                        
        使用动态的VectorDrawable
            
                
                

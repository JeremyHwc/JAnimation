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
            
        简单案例：
        
        <vector
            xmlns:android="http://schemas.android.com/apk/res/android"
            android:width="200dp"
            android:height="200dp"
            android:viewportHeight="500"
            android:viewportWidth="500">
        
            <path
                android:name="square"
                android:fillColor="#000000"
                android:pathData="M100,100,L400,100,L400,400,L100,400z"/>
        
        </vector>

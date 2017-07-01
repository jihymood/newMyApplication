Coordinator 协调者         -> CoordinatorLayout <br>
AppBar      导航栏、应用栏 -> AppBarLayout<br>
Collapsing  折叠、压缩     -> CollapsingToolbarLayout<br>
Toolbar     工具栏         -> Toolbar <br>
TabLayout   标签tab        -> TabLayout <br>
` 注：方法一：在CoordinatorLayout布局中，要想保证ViewPager<br>
      在layout_app_bar的下面，需要添加一行代码<br>
      app:layout_behavior="@string/appbar_scrolling_view_behavior"<br>
      因为在在CoordinatorLayout布局中没有below属性<br>
      方法二：可以在AppBarLayout外面套一层LinearLayout，设置为vertical`<br>

爱吖妹纸AiYaGirl布局效果：<br>
-CoordinatorLayout<br>
--AppBarLayout<br>
---CollapsingToolbarLayout<br>
----ImageView<br>
----Banner<br>
----Toolbar<br>
-----DachshundTabLayout/TabLayout<br>
--ViewPager<br>
![](https://github.com/jihymood/newMyApplication/blob/master/screenshot/Screenshot_1498897756.png)

 
仿制最新版Google Play的apk的标题栏折叠效果：<br>
布局：<br>
-CoordinatorLayout<br>
--AppBarLayout<br>
---CollapsingToolbarLayout(scrollFlags="scroll|exitUntilCollapsed|snap")<br>
----FrameLayout(展示内容的容器)<br>
----Toolbar<br>
--FrameLayout(Fragment的容器，有appbar_scrolling_view_behavior)<br>

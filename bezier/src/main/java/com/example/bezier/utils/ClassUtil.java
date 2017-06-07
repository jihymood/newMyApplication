package com.example.bezier.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HASEE on 2017/5/11 11:03
 */

public class ClassUtil {
//    public static void main(String[] args) {
//        try {
//            System.out.println("接口实现类：");
//            for (Class<?> c : getAllAssignedClass(Intf.class)) {
//                System.out.println(c.getName());
//            }
//            System.out.println("子类：");
//            for (Class<?> c : getAllAssignedClass(Man.class)) {
//                System.out.println(c.getName());
//            }
//        } catch (ClassNotFoundException e) {
//// TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//// TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }


    /**
     * 获取同一路径下所有子类或接口实现类
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static List<Class<?>> getAllAssignedClass(Class<?> cls) throws IOException,
            ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        for (Class<?> c : getClasses(cls)) {
            if (cls.isAssignableFrom(c) && !cls.equals(c)) {
                classes.add(c);
            }
        }
        return classes;
    }


    /**
     * 取得当前类路径下的所有类
     *
     * @param cls
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */

    public static List<Class<?>> getClasses(Class<?> cls) throws IOException,
            ClassNotFoundException {
        List<File> list = new ArrayList<>();
        String pk = cls.getPackage().getName();
        String path = pk.replace('.', '/');
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL url = classloader.getResource(path);
//        URL url = classloader.getResource("/data/data/app/com/example/hasee/baidutest");
//        Enumeration<URL> resouces=classloader.getResources(path);
//        while (resouces.hasMoreElements()) {
//            URL url = resouces.nextElement();
//            list.add(new File(url.getFile()));
//
//
//
//        }
//        List<Class> classes = new ArrayList<>();
//        for (Class aClass : classes) {
//            aClass.
//        }
        return getClasses(new File(url.getFile()), pk);
    }


    /**
     * 迭代查找类
     *
     * @param dir
     * @param pk
     * @return
     * @throws ClassNotFoundException
     */
    private static List<Class<?>> getClasses(File dir, String pk) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        if (!dir.exists()) {
            return classes;
        }
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                classes.addAll(getClasses(f, pk + "." + f.getName()));
            }
            String name = f.getName();
            if (name.endsWith(".class")) {
                classes.add(Class.forName(pk + "." + name.substring(0, name.length() - 6)));
            }
        }
        return classes;
    }


    /**
     * 使用reflections库反射
     */
    /*public static void getMyClasses(Class<?> cls) throws IOException,
            ClassNotFoundException {
//        Reflections reflections = new Reflections("DrawPointByWindow");
//        Class myClass=reflections.getClass();
//        Reflections reflections1 = new Reflections();
        Reflections reflections1 = new Reflections("com.example.hasee.baidutest.newtest");

//        Set<String> allTypes = reflections1.getAllTypes();
//        Log.e("ClassUtil", "size:"+allTypes.size()+"");
//        for (String allType : allTypes) {
//            Log.e("ClassUtil", allType);
//        }

////scan urls that contain 'my.package', include inputs starting with 'my.package', use the default scanners
//        Reflections reflections = new Reflections("my.package");
////or using ConfigurationBuilder
//        new Reflections(new ConfigurationBuilder()
//                .setUrls(ClasspathHelper.forPackage("my.project.prefix"))
//                .setScanners(new SubTypesScanner(),
//                        new TypeAnnotationsScanner().filterResultsBy(optionalFilter)),
//                .filterInputsBy(new FilterBuilder().includePackage("my.project.prefix")));

        final Set<Class<? extends CustomDrawPointBasic>> subTypesOf = reflections1.getSubTypesOf(
                CustomDrawPointBasic.class);
        Log.e("ClassUtil", "size:" + subTypesOf.size() + "");
        for (Class<? extends CustomDrawPointBasic> aClass : subTypesOf) {
            Log.e("ClassUtil", "aClass:" + aClass.getName());
        }

        final Class<? extends Reflections> aClass = reflections1.getClass();
        Log.e("ClassUtil", "aClass:" + aClass.getName());


        final Set<Class<? extends LayerIconInterface>> subTypesOf1 = reflections1.getSubTypesOf(
                com.example.hasee.baidutest.newtest.LayerIconInterface.class);
        Log.e("ClassUtil", "size1:" + subTypesOf1.size() + "");
        for (Class<? extends CustomDrawPointBasic> aClass1 : subTypesOf) {
            Log.e("ClassUtil", "aClass1:" + aClass1.getName());
        }

        


    }*/


}
